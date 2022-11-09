package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Tipo_usuario;

import java.util.List;

@Repository
public interface ITipo_usuarioRepository extends JpaRepository<Tipo_usuario, Integer> {
    @Query("from Tipo_usuario p where  p.nombreTipoUsuario like %:nombreTipoUsuario%")
    List<Tipo_usuario> search(@Param("nombreTipoUsuario") String nombreTipoUsuario);
}
