package pe.edu.upc.trickfit.servicesimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.trickfit.entities.Usuario;
import pe.edu.upc.trickfit.repositories.IUsuarioRepository;
import pe.edu.upc.trickfit.config.servicesinterfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private IUsuarioRepository uR;

    @Override
    @Transactional
    public boolean insertar(Usuario usuario) {
        Usuario objUsuario = uR.save(usuario);
        if(objUsuario==null) {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public List<Usuario> listar() {
        return uR.findAll();
    }

    @Override
    public Optional<Usuario> listarId(int idUsuario) {
        return uR.findById(idUsuario);
    }

    @Override
    public List<Usuario> buscarUsuario(String nombreUsuario) {
        return uR.buscarUsuario(nombreUsuario);
    }

    @Override
    public List<Usuario> buscarDni(String dni) {
        return uR.buscarDni(dni);
    }

    @Override
    public List<Usuario> buscarTipo(String nombreTipoUsuario) {
        return uR.buscarTipo(nombreTipoUsuario);
    }
}
