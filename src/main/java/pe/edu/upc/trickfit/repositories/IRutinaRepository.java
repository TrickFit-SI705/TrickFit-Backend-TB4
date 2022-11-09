package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Rutina;

import java.util.List;

@Repository
public interface IRutinaRepository extends JpaRepository<Rutina, Integer> {
    @Query("from Rutina r where r.tituloRutina like %:tituloRutina%")
    List<Rutina> buscarRutina(@Param("tituloRutina") String tituloRutina);

    @Query("from Rutina r where r.usuario.nombreUsuario like %:nombreUsuario%")
    List<Rutina> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query("from Rutina r where r.entrenador.nombreUsuario like %:nombreUsuario%")
    List<Rutina> buscarEntrenador(@Param("nombreUsuario") String nombreUsuario);
}
