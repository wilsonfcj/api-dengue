package ifsc.sti.tcc.resources.rest.models.usuario.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisciplinaBaseRequest {
	
	@JsonProperty(value="IdUsuario")
	Long idUsuario;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
