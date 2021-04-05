package ifsc.sti.tcc.resources.rest.models.usuario.foco;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FocoRequest {

	@JsonProperty(value = "Descricao")
	private String descricao;
	
	@JsonProperty(value = "Endereco")
	private String endereco;
	
	@JsonProperty(value = "Latitude")
	private Double latitude;
	
	@JsonProperty(value = "Longitude")
	private Double longitude;
	
	@JsonProperty(value = "Imagem")
	private String imagem;
	
	@JsonProperty(value = "DataCadastro")
	private Date dataCadastro;
	
	@JsonProperty(value = "IdUsuario")
	private Long idUsuario;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
