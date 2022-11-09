package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Plan;

import java.util.List;

@Repository
public interface IPlanRepository extends JpaRepository<Plan, Integer> {
    @Query("from Plan p where p.nombrePlan like %:nombrePlan%")
    List<Plan> search(@Param("nombrePlan") String nombrePlan);
}
