package ifsc.sti.tcc.resources.rest.models.usuario.cadastro;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.utilidades.ValidateUtil;
import ifsc.sti.tcc.utilidades.ValidatedField;

public class UsuarioRequest {

	@JsonProperty(value = "CPF")
	private String cpf;

	@JsonProperty(value = "Nascimento")
	private Date nascimento;

	@JsonProperty(value = "Nome")
	private String nome;

	@JsonProperty(value = "Email")
	private String email;

	@JsonProperty(value = "Telefone")
	private String fone;
	
	@JsonProperty(value = "Senha")
	private String senha;

	public String getCpf() {
		return cpf.replace(".", "").replace("-", "");
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
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

	public String getFone() {
		return fone.replace("(", "").replace(")", "").replace("-", "").trim();
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean cpfValido() {
		return ValidateUtil.isCPF(ValidateUtil.unmask(cpf));
	}

	public int nomeValido() {
		return ValidateUtil.validateString(nome, 200);
	}

	public int emailValido() {
		return ValidateUtil.validateStringWithRegex(email, 200, ValidateUtil.REGEX_EMAIL);
	}

	public int foneValido() {
		return ValidateUtil.validateCelular(fone);
	}

	public ValidatedField validarCampos() {
		ValidatedField validatedField;
		if (!cpfValido()) {
			validatedField = new ValidatedField("CPF Inválido", false);
			return validatedField;
		}

		switch (nomeValido()) {
		case ValidateUtil.STRING_LONGA:
			return new ValidatedField("Nome deve conter no máximo 200 caracteres", false);
		case ValidateUtil.STRING_VAZIA:
			return new ValidatedField("Informe um nome válido", false);
		}

		switch (foneValido()) {
		case ValidateUtil.STRING_LONGA:
			return new ValidatedField("O telefone deve conter no máximo 14 caracteres", false);
		case ValidateUtil.STRING_INVALIDA:
			return new ValidatedField("Número de celular inválido", false);
		}
			
		
		return new ValidatedField("Campos informados com sucesso", true);
	}
}
