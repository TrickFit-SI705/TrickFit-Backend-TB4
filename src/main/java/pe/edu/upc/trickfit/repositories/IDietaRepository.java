package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Dieta;

import java.util.List;

@Repository
public interface IDietaRepository extends JpaRepository<Dieta, Integer> {
    @Query("from Dieta d where d.tituloDieta like %:tituloDieta%")
    List<Dieta> buscarDieta(@Param("tituloDieta") String tituloDieta);

    @Query("from Dieta d where d.usuario.nombreUsuario like %:nombreUsuario%")
    List<Dieta> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);
    @Query("from Dieta d where d.nutricionista.nombreUsuario like %:nombreUsuario%")
    List<Dieta> buscarNutricionista(@Param("nombreUsuario") String nombreUsuario);
}
