package ifsc.sti.tcc.resources.rest.models.usuario.login.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ImagemResponse {
	
	@JsonProperty(value="Id")
	private Long id;
	
	@JsonProperty(value="Imagem")
	private String imagem;
	
	public ImagemResponse() {
		super();
	}

	public ImagemResponse(Long id, String imagem) {
		super();
		this.id = id;
		this.imagem = imagem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

}
