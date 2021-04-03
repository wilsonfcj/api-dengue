package ifsc.sti.tcc.modelos.usuario;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import ifsc.sti.tcc.utilidades.UserUtil;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8406291256835657000L;
	
	@Id
	@Column(name = "id_usuario")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cpf;
	private Date nascimento;
	private String nome;
	private String email;
	private String fone;	
	private String senha;
	private Long instituicao;
	private Boolean ativo;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
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
		return fone;
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
	
	public Long getInstituicao() {
		return instituicao;
	}
	
	public void setInstituicao(Long instituicao) {
		this.instituicao = instituicao;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public static Usuario buscarUsuarioCPF(String cpf) {
		return UserUtil.buscarUsuarioCPF(cpf); // Provisorios pois pegaremos essas informações do banco
	}
	
	public static boolean autenticarUsuario(Usuario usuario, String senha) {
		return usuario.getSenha().equals(senha);
	}
}
