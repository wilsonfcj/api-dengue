package ifsc.sti.tcc.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.ImageUpdateRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ImagemResponse;
import ifsc.sti.tcc.service.ImagemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Imagem")
public class ImagemAPI {
	
	@Autowired
	private ImagemRepository imagemRepository;
	
	@ApiOperation(value = "Deleta a imagem por id usuário")
	@GetMapping("/DeletarImagemPorIdUsuario")
	public ResponseEntity<ResponseBase<ImagemResponse>> deletarImagemIdUsuario(@RequestParam Long id) {
		ImagemService lUsuarioService = new ImagemService.Instance(imagemRepository).build();
		return lUsuarioService.deletar(id);
	}

	@ApiOperation(value = "Deleta a imagem por seu id")
	@GetMapping("/DeletarImagemPorId")
	public ResponseEntity<ResponseBase<ImagemResponse>> deletarImagemId(@RequestParam Long id) {
		ImagemService lUsuarioService = new ImagemService.Instance(imagemRepository).build();
		return lUsuarioService.deletarPorId(id);
	}

	@ApiOperation(value = "Consultar imagem por id usuário")
	@GetMapping("/BuscarImagemPorIdUsuario")
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarImagemIdUsuario(@RequestParam Long idUsuario) {
		ImagemService lUsuarioService = new ImagemService.Instance(imagemRepository).build();
		return lUsuarioService.buscarPorId(idUsuario);
	}
	
	@ApiOperation(value = "Consultar imagem por id")
	@GetMapping("/BuscarImagemPorId")
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarImagemId(@RequestParam Long id) {
		ImagemService lUsuarioService = new ImagemService.Instance(imagemRepository).build();
		return lUsuarioService.buscarPorIdImg(id);
	}
	
	@ApiOperation(value = "Alterar imagem por ID usuário")
	@RequestMapping(value = "/AlterarImagemPorId", method = RequestMethod.PUT)
	public ResponseEntity<ResponseBase<ImagemResponse>> alterarImagemId(@RequestBody @Valid ImageUpdateRequest idUsuario) {
		ImagemService lUsuarioService = new ImagemService.Instance(imagemRepository).build();
		return lUsuarioService.alterar(idUsuario);
	}
	
	
}
