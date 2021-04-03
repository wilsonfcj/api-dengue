package ifsc.sti.tcc.repository;

import java.sql.ResultSet;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findById(long id);
	Usuario findByCpf(String cpf);
	
	@Query(value = "UPDATE usuario set nome = ?1, email = ?2, fone = ?3, instituicao = ?4, nascimento = ?5, senha = ?6, ano_ingresso = ?7, matricula = ?8  WHERE cpf = '00486870065'", nativeQuery = true)
	ResultSet update(String nome, String email, String fone, String Instituicao, Date nascimento, String senha, int anoIngresso, long matricula, String cpf);
}
