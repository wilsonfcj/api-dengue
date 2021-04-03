package ifsc.sti.tcc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.UsuarioMapper;
import ifsc.sti.tcc.resources.mappers.viewtodomain.AlterarMapper;
import ifsc.sti.tcc.resources.mappers.viewtodomain.CadastroMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.utilidades.ValidatedField;

public class UsuarioService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	private UsuarioRepository jpaRepository;

	public static class Instance extends BaseService<UsuarioRepository> implements BaseService.BaseObject<UsuarioService> {

		public Instance(UsuarioRepository jpaRepository) {
			super(jpaRepository);
		}

		@Override
		public UsuarioService build() {
			UsuarioService service = new UsuarioService();
			service.setJpaRepository(jpaRepository);
			return service;
		}
	}

	private Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
		Usuario usuarioCadastro = new CadastroMapper().transform(usuarioRequest);
		Usuario usuario = jpaRepository.save(usuarioCadastro);
		return usuario;
	}

	private Usuario alterarUsuario(Usuario usuario, UsuarioRequest usuarioRequest) {
		usuario.setNome(usuarioRequest.getNome());
		return jpaRepository.save(new AlterarMapper().transform(usuario, usuarioRequest));
	}

	private UsuarioBaseResponse converterUsuario(Usuario usuario) {
		UsuarioBaseResponse usuarioBaseResponse = new UsuarioMapper().transform(usuario);
		return usuarioBaseResponse;
	}

	public ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>> buscar() {
		ResponseBase<List<UsuarioBaseResponse>> baseResponse = new ResponseBase<>();
		List<Usuario> usuarios = jpaRepository.findAll();
		List<UsuarioBaseResponse> usuarioBaseResponses = new ArrayList<UsuarioBaseResponse>();
		for (Usuario usuario : usuarios) {
			usuarioBaseResponses.add(converterUsuario(usuario));
		}
		baseResponse = new ResponseBase<>(usuarioBaseResponses.size() > 0,
				usuarioBaseResponses.size() > 0 ? "Informações carredas com sucesso" : "Nenhum usuário cadastrado",
				usuarioBaseResponses);

		return new ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscar(long id) {
		Usuario usuario = jpaRepository.findById(id);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if (usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscar(String cpf) {
		Usuario usuario = jpaRepository.findByCpf(cpf);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if (usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> autenticar(LoginRequest loginRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = jpaRepository.findByCpf(loginRequest.getCpf());
		if (usuario != null) {
			if (Usuario.autenticarUsuario(usuario, loginRequest.getSenha())) {
				baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuário ou Senha inválida", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível carregar as informações",
					null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> cadastrar(UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if (validatedField.getSuccess()) {
			if (jpaRepository.findByCpf(usuarioRequest.getCpf()) == null) {
				Usuario usuario = salvarUsuario(usuarioRequest);
				
				if (usuario != null) {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario cadastrado com sucesso",
							converterUsuario(usuario));
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false,
							"Não foi possível cadastrar o usuário, tente novamente mais tarde",
							converterUsuario(usuario));
				}
	
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario já cadastrado", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> alterar(UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if (validatedField.getSuccess()) {
			Usuario usuario = jpaRepository.findByCpf(usuarioRequest.getCpf());
			if (usuario != null) {
				if(usuarioRequest.getSenha() == null) {
					usuarioRequest.setSenha(usuario.getSenha());
				}
				Usuario usuarioAlterado = alterarUsuario(usuario, usuarioRequest);
				if (usuarioAlterado != null) {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario Alterado com sucesso",
							converterUsuario(usuarioAlterado));
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false,
							"Não foi possível alterar o usuário, tente novamente mais tarde",
							converterUsuario(usuario));
				}
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public UsuarioRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(UsuarioRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
}
