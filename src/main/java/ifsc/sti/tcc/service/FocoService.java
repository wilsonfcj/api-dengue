package ifsc.sti.tcc.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.usuario.Foco;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.repository.FocoRepository;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.viewtodomain.FocoMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoResponse;

public class FocoService {

	private FocoRepository jpaRepository;
	private UsuarioService usuarioService;


	public static class Instance extends BaseService<FocoRepository> implements BaseService.BaseObject<FocoService> {

		public Instance(FocoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		private UsuarioRepository usuarioRepository;
		private ImagemRepository imagemRepository;
		
		public Instance withUsuarioRepository(UsuarioRepository repository) {
			this.usuarioRepository = repository;
			return this;
		}
		
		public Instance withImagemRepository(ImagemRepository repository) {
			this.imagemRepository = imagemRepository;
			return this;
		}
		
		@Override
		public FocoService build() {
			FocoService service = new FocoService();
			service.setJpaRepository(jpaRepository);
			service.setUsuarioService(new UsuarioService
					.Instance(usuarioRepository)
					.withImagemRepository(imagemRepository)
					.build());
			return service;
		}
	}
	
	private Foco salvarFoco(FocoRequest focoRequest, Usuario usuario) {
		Foco foco = new FocoMapper().transform(focoRequest);
		foco.setIdUsuario(usuario);
		Foco focoCadastrado = jpaRepository.save(foco);
		return focoCadastrado;
	}
	
	private FocoResponse converterFoco(Foco foco) {
		FocoResponse focoResponse = new ifsc.sti.tcc.resources.mappers.domaintoview.FocoMapper().transform(foco);
		return focoResponse;
	}
	
	private List<FocoResponse> converterFoco(List<Foco> foco) {
		List<FocoResponse> focoResponse = new ifsc.sti.tcc.resources.mappers.domaintoview.FocoMapper().transform(foco);
		return focoResponse;
	}
	
	
	public ResponseEntity<ResponseBase<FocoResponse>> cadastrar(FocoRequest focoRequest) {
		ResponseBase<FocoResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = usuarioService.loadUser(focoRequest.getIdUsuario());
		Foco foco = salvarFoco(focoRequest, usuario);
		if (foco != null) {
			baseResponse = new ResponseBase<FocoResponse>(true, "Possível foco de dengue cadastrado com sucesso",
					converterFoco(foco));
		} else {
			baseResponse = new ResponseBase<FocoResponse>(false, "Não foi possível cadastrar o possível foco, tente novamente mais tarde",
							null);
		}	
		return new ResponseEntity<ResponseBase<FocoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<FocoResponse>>> buscarFocos() {
		ResponseBase<List<FocoResponse>> baseResponse = new ResponseBase<>();
		List<Foco> foco = jpaRepository.findAll();
		if (foco != null) {
			baseResponse = new ResponseBase<List<FocoResponse>>(true, "Possíveis focos de dengue carregados com sucesso",
					converterFoco(foco));
		} else {
			baseResponse = new ResponseBase<List<FocoResponse>>(false, "Não foi possível cadastrar o possível foco, tente novamente mais tarde",
							null);
		}	
		return new ResponseEntity<ResponseBase<List<FocoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<FocoResponse>>> buscarFocos(long userId) {
		ResponseBase<List<FocoResponse>> baseResponse = new ResponseBase<>();
		List<Foco> foco = jpaRepository.findByIdUser(userId);
		if (foco != null) {
			baseResponse = new ResponseBase<List<FocoResponse>>(true, "Possíveis focos de dengue carregados com sucesso",
					converterFoco(foco));
		} else {
			baseResponse = new ResponseBase<List<FocoResponse>>(false, "Não foi possível cadastrar o possível foco, tente novamente mais tarde",
							null);
		}	
		return new ResponseEntity<ResponseBase<List<FocoResponse>>>(baseResponse, HttpStatus.OK);
	}
	

	public FocoRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(FocoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}
