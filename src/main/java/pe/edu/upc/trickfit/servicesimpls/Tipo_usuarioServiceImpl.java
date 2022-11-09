package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.trickfit.entities.Tipo_usuario;
import pe.edu.upc.trickfit.repositories.ITipo_usuarioRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.ITipo_usuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class Tipo_usuarioServiceImpl implements ITipo_usuarioService {
    @Autowired
    private ITipo_usuarioRepository tuR;

    @Override
    public void insert(Tipo_usuario tipo_usuario) {
        tuR.save(tipo_usuario);
    }

    @Override
    public List<Tipo_usuario> list() {
        return tuR.findAll();
    }

    @Override
    public Optional<Tipo_usuario> listarId(int idTipoUsuario) {
        return tuR.findById(idTipoUsuario);
    }

    @Override
    public void delete(int idTipoUsuario) {
        tuR.deleteById(idTipoUsuario);
    }

    @Override
    public List<Tipo_usuario> search(String nombreTipoUsuario) {
        return tuR.search(nombreTipoUsuario);
    }
}
