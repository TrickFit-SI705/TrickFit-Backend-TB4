package pe.edu.upc.trickfit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.trickfit.entities.Suscripcion;

import java.util.List;

@Repository
public interface ISuscripcionRepository extends JpaRepository<Suscripcion, Integer> {
    @Query("from Suscripcion s where s.plan.nombrePlan like %:nombrePlan%")
    List<Suscripcion> buscarPlan(@Param("nombrePlan") String nombrePlan);
    @Query("from Suscripcion s where s.tarjeta.numeroTarjeta like %:numeroTarjeta%")
    List<Suscripcion> buscarTarjeta(@Param("numeroTarjeta") String numeroTarjeta);

    @Query("from Suscripcion s where s.usuario.nombreUsuario like %:nombreUsuario%")
    List<Suscripcion> buscarUsuario(@Param("nombreUsuario") String nombreUsuario);
}
