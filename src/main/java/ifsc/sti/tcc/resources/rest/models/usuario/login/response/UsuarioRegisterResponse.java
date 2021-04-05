package ifsc.sti.tcc.resources.rest.models.usuario.login.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioRegisterResponse {
	
	@JsonProperty(value="IdUsuario")
	private Long id;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Email")
	private String email;

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
