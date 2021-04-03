package ifsc.sti.tcc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.usuario.Imagem;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.ImagemMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.ImageUpdateRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ImagemResponse;

public class ImagemService {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(ImagemService.class);
	private ImagemRepository jpaRepository;
	
	public static class Instance extends BaseService<ImagemRepository>  implements BaseService.BaseObject<ImagemService> {
		
		public Instance(ImagemRepository jpaRepository) {
			super(jpaRepository);
		}
		
		@Override
		public ImagemService build() {
			ImagemService service = new ImagemService();
			service.setJpaRepository(jpaRepository);
			return service;
		}
	}
	
	public Imagem buscarImagem(Long idUsuario) {
		return jpaRepository.findByIdUsuario((long)idUsuario);
	}
	
	public Imagem saveImage(Long idUsuario, String usuarioImagem) {
		return jpaRepository.save(new Imagem(idUsuario, usuarioImagem));
	}
	
	public Imagem alterarImagem(Long idUsuario, String usuarioImagem) {
		Imagem imagem = jpaRepository.findByIdUsuario(idUsuario);
		if(imagem == null) {
			imagem = new Imagem(idUsuario); 
		}
		imagem.setPerfil(usuarioImagem);
		return jpaRepository.save(imagem);
	}
	
	private Imagem alterarImagem(ImageUpdateRequest idUsuario) {
		return alterarImagem(idUsuario.getIdUsuario(), idUsuario.getImagem());
	}
	
	public ImagemRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(ImagemRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	public ResponseEntity<ResponseBase<ImagemResponse>> deletar(Long id) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		try {
			Imagem imagem = jpaRepository.findByIdUsuario((long) id);
			if(imagem != null) {
				jpaRepository.delete(imagem);
				baseResponse = new ResponseBase<>(true, "Imagem deletada com com sucesso",  new ImagemMapper().transform(imagem));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ImagemResponse>> deletarPorId(Long id) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		try {
			Imagem imagem = jpaRepository.findById((long) id);
			if(imagem != null) {
				jpaRepository.delete(imagem);
				baseResponse = new ResponseBase<>(true, "Imagem deletada com sucesso",  new ImagemMapper().transform(imagem));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível remover a imagem", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarPorId(Long idUsuario) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = jpaRepository.findByIdUsuario((long) idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem consultada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma Imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarPorIdImg(Long idUsuario) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = jpaRepository.findById((long) idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem consultada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma Imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ImagemResponse>> alterar(ImageUpdateRequest idUsuario){
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = alterarImagem(idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem alterada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Não foi possivel alterar a imagem", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
}


