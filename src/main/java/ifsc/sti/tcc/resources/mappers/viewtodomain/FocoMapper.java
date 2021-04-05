package ifsc.sti.tcc.resources.mappers.viewtodomain;

import ifsc.sti.tcc.modelos.usuario.Foco;
import ifsc.sti.tcc.resources.rest.models.usuario.foco.FocoRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class FocoMapper extends MapperUtil<FocoRequest, Foco> {

	@Override
	public Foco transform(FocoRequest aObject) {
		Foco foco = new Foco();

		foco.setEndereco(aObject.getEndereco());
		foco.setDescricao(aObject.getDescricao());
		foco.setImagem(aObject.getImagem());
		foco.setLatitude(aObject.getLatitude());
		foco.setLongitude(aObject.getLongitude());
		foco.setDataCadastro(aObject.getDataCadastro());

		return foco;
	}


}