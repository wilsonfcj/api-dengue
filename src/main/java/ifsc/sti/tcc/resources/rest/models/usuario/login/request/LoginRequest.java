package ifsc.sti.tcc.resources.rest.models.usuario.login.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {
	
	@JsonProperty(value="CPF")
	private String cpf;
	
	@JsonProperty(value="Senha")
	private String senha;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
