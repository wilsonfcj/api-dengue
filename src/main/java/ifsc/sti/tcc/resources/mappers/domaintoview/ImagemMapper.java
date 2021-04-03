package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.usuario.Imagem;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ImagemResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class ImagemMapper extends MapperUtil<Imagem, ImagemResponse> {

	@Override
	public ImagemResponse transform(Imagem aObject) {
		return new ImagemResponse(aObject.getId(), aObject.getPerfil());
	}

}