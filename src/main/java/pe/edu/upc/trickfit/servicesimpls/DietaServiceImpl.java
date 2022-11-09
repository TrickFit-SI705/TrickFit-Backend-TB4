package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Dieta;
import pe.edu.upc.trickfit.repositories.IDietaRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.IDietaService;

import java.util.List;
import java.util.Optional;

@Service
public class DietaServiceImpl implements IDietaService {

    @Autowired
    private IDietaRepository dR;

    @Override
    @Transactional
    public boolean insertar(Dieta dieta) {
        Dieta objDieta = dR.save(dieta);
        if (objDieta==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idDieta) {
        dR.deleteById(idDieta);
    }

    @Override
    public List<Dieta> listar() {
        return dR.findAll();
    }

    @Override
    public Optional<Dieta> listarId(int idDieta) {
        return dR.findById(idDieta);
    }

    @Override
    public List<Dieta> buscarDieta(String tituloDieta) {
        return dR.buscarDieta(tituloDieta);
    }

    @Override
    public List<Dieta> buscarUsuario(String nombreUsuario) {
        return dR.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Dieta> buscarNutricionista(String nombreNutricionista) {
        return dR.buscarNutricionista(nombreNutricionista);
    }
}
