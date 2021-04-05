package ifsc.sti.tcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.FocoRepository;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoResponse;
import ifsc.sti.tcc.service.FocoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Focos")
public class FocoAPI {

	
	@Autowired
	private FocoRepository focoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private ImagemRepository imagemRepository;
	
	
	@ApiOperation(value = "Registra um possível foco de dengue")
	@RequestMapping(value = "/CadastrarFoco", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<FocoResponse>> registarFoco(@RequestBody FocoRequest focoRequest) {
		FocoService focoService = new FocoService.Instance(focoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withImagemRepository(imagemRepository)
				.build();
		return focoService.cadastrar(focoRequest);
	}
	
	
	@ApiOperation(value = "Busca todos os focos de dengue")
	@GetMapping("/BuscarFocos")
	public ResponseEntity<ResponseBase<List<FocoResponse>>> buscarTodosOsFocos() {
		FocoService focoService = new FocoService.Instance(focoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withImagemRepository(imagemRepository)
				.build();
		return focoService.buscarFocos();
	}
	
	@ApiOperation(value = "Busca todos os focos de dengue de um usuário")
	@GetMapping("/BuscarFocosPorId")
	public ResponseEntity<ResponseBase<List<FocoResponse>>> buscarTodosOsFocos(@RequestParam Long idUsuario) {
		FocoService focoService = new FocoService.Instance(focoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withImagemRepository(imagemRepository)
				.build();
		return focoService.buscarFocos(idUsuario);
	}
}
