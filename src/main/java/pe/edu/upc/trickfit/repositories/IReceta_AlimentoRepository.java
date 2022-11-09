package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Receta_Alimento;

import java.util.List;

@Repository
public interface IReceta_AlimentoRepository extends JpaRepository<Receta_Alimento, Integer> {
    @Query("from Receta_Alimento ra where ra.receta.tituloReceta like %:tituloReceta%")
    List<Receta_Alimento> buscarReceta(@Param("tituloReceta") String tituloReceta);

    @Query("from Receta_Alimento ra where ra.alimento.nombreAlimento like %:nombreAlimento%")
    List<Receta_Alimento> buscarAlimento(@Param("nombreAlimento") String nombreAlimento);
}
