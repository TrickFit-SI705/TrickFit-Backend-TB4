package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Rutina;
import pe.edu.upc.trickfit.repositories.IRutinaRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.IRutinaService;

import java.util.List;
import java.util.Optional;

@Service
public class RutinaServiceImpl implements IRutinaService {

    @Autowired
    private IRutinaRepository rtR;

    @Override
    @Transactional
    public boolean insertar(Rutina rutina) {
        Rutina objRutina = rtR.save(rutina);
        if (objRutina==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idRutina) {
        rtR.deleteById(idRutina);
    }

    @Override
    public List<Rutina> listar() {
        return rtR.findAll();
    }

    @Override
    public Optional<Rutina> listarId(int idRutina) {
        return rtR.findById(idRutina);
    }

    @Override
    public List<Rutina> buscarRutina(String tituloRutina) {
        return rtR.buscarRutina(tituloRutina);
    }

    @Override
    public List<Rutina> buscarUsuario(String nombreUsuario) {
        return rtR.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Rutina> buscarEntrenador(String nombreEntrenador) {
        return rtR.buscarEntrenador(nombreEntrenador);
    }
}
