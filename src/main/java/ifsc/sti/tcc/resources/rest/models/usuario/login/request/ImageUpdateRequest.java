package ifsc.sti.tcc.resources.rest.models.usuario.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImageUpdateRequest {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="Imagem")
	private String imagem;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
}
