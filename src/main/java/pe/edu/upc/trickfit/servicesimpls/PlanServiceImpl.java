package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Plan;
import pe.edu.upc.trickfit.repositories.IPlanRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.IPlanService;

import java.util.List;
import java.util.Optional;

@Service
public class PlanServiceImpl implements IPlanService {
    @Autowired
    private IPlanRepository pR;

    @Override
    public void insert(Plan plan) {
        pR.save(plan);
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }

    @Override
    public Optional<Plan> listarId(int idPlan) {
        return pR.findById(idPlan);
    }

    @Override
    public void delete(int idPlan) {
        pR.deleteById(idPlan);
    }

    @Override
    public List<Plan> search(String nombrePlan) {
        return pR.search(nombrePlan);
    }
}
