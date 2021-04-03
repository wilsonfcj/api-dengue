package ifsc.sti.tcc.resources.rest.models.usuario.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisciplinaCodRequest extends DisciplinaBaseRequest {
	
	@JsonProperty(value="Codigo")
	private Integer cod;

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}
}
