package ifsc.sti.tcc.modelos.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagem")
public class Imagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5488394787476016982L;
	
	@Id
	@Column(name = "id_imagem")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idUsuario;
	
	@Column(columnDefinition="TEXT")
	private String perfil;
	
	public Imagem() {
		super();
	}

	public Imagem(String perfil) {
		super();
		this.perfil = perfil;
	}
	
	public Imagem(Long idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}
	
	public Imagem(Long idUsuario, String perfil) {
		super();
		this.idUsuario = idUsuario;
		this.perfil = perfil;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
