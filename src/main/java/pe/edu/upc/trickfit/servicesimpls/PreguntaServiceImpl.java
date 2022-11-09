package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Pregunta;
import pe.edu.upc.trickfit.repositories.IPreguntaRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.IPreguntaService;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaServiceImpl implements IPreguntaService {

    @Autowired
    private IPreguntaRepository prR;

    @Override
    @Transactional
    public boolean insertar(Pregunta pregunta) {
        Pregunta objPregunta = prR.save(pregunta);
        if (objPregunta==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idPregunta) {
        prR.deleteById(idPregunta);
    }

    @Override
    public List<Pregunta> listar() {
        return prR.findAll();
    }

    @Override
    public Optional<Pregunta> listarId(int idPregunta) {
        return prR.findById(idPregunta);
    }

    @Override
    public List<Pregunta> buscarPregunta(String tituloPregunta) {
        return prR.buscarPregunta(tituloPregunta);
    }

    @Override
    public List<Pregunta> buscarUsuario(String nombreUsuario) {
        return prR.buscarUsuario(nombreUsuario);
    }
}
