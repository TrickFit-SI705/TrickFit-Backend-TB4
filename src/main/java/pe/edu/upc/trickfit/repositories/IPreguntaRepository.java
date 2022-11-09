package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Pregunta;

import java.util.List;

@Repository
public interface IPreguntaRepository extends JpaRepository<Pregunta, Integer> {
    @Query("from Pregunta p where p.tituloPregunta like %:tituloPregunta%")
    List<Pregunta> buscarPregunta(@Param("tituloPregunta") String tituloPregunta);

    @Query("from Pregunta p where p.usuario.nombreUsuario like %:nombreUsuario%")
    List<Pregunta> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);
}
