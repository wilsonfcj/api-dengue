package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.usuario.Foco;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioRegisterResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class FocoMapper extends MapperUtil<Foco, FocoResponse> {

	@Override
	public FocoResponse transform(Foco aObject) {
		FocoResponse foco = new FocoResponse();

		foco.setId(aObject.getId());
		foco.setEndereco(aObject.getEndereco());
		foco.setDescricao(aObject.getDescricao());
		foco.setImagem(aObject.getImagem());
		foco.setLatitude(aObject.getLatitude());
		foco.setLongitude(aObject.getLongitude());
		foco.setDataCadastro(aObject.getDataCadastro());

		if(aObject.getIdUsuario() != null) {
			UsuarioRegisterResponse usuarioRegisterResponse = new UsuarioRegisterResponse();
			usuarioRegisterResponse.setId(aObject.getIdUsuario().getId());
			usuarioRegisterResponse.setNome(aObject.getIdUsuario().getNome());
			usuarioRegisterResponse.setEmail(aObject.getIdUsuario().getEmail());
			foco.setUsuario(usuarioRegisterResponse);
		}
		
		
		return foco;
	}


}