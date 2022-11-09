package pe.edu.upc.trickfit.config.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Plan;

import java.util.List;
import java.util.Optional;

public interface IPlanService {
    public void insert(Plan plan);
    List<Plan>list();
    public Optional<Plan> listarId(int idPlan);
    public void delete(int idPlan);

    List<Plan> search(String nombrePlan);
}
