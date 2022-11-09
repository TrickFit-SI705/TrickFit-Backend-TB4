package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Usuario;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("from Usuario u where u.nombreUsuario like %:nombreUsuario%")
    List<Usuario> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Usuario u where u.DNI like %:DNI%")
    List<Usuario> buscarDni(@Param("DNI") String DNI);

    @Query("from Usuario u where u.tipo_usuario.nombreTipoUsuario like %:nombreTipoUsuario%")
    List<Usuario> buscarTipo(@Param("nombreTipoUsuario") String nombreTipoUsuario);
}
