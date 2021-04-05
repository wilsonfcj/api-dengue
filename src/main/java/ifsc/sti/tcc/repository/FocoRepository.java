package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.usuario.Foco;

public interface FocoRepository extends JpaRepository<Foco, Long> {
	
	
	List<Foco> findAll();
	Foco findById(long id);
	
	@Query(value = "SELECT * FROM foco WHERE id_usuario = ?1", nativeQuery = true)
	List<Foco> findByIdUser(long id);
}
