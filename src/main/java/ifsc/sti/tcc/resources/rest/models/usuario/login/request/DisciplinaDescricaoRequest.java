package ifsc.sti.tcc.resources.rest.models.usuario.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisciplinaDescricaoRequest extends DisciplinaBaseRequest {
	
	@JsonProperty(value="Descricao")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
