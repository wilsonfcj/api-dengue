package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.usuario.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long>  {
	
	Imagem findById(long id);
	Imagem findByIdUsuario(long idUsuario);
	
	@Query(value = "DELETE FROM imagem WHERE id_imagem = ?1", nativeQuery = true)
	Imagem deleteById(long idImamge);
		
	@Query(value = "DELETE FROM imagem WHERE id_usuario = ?1", nativeQuery = true)
	Imagem deleteByIdUsuario(long idUsuario);
	
	@Query(value = "UPDATE FROM imagem SET perfil = ?1 WHERE id_usuario = ?2", nativeQuery = true)
	Imagem updateImageById(String imagem, long idUsuario);
}
