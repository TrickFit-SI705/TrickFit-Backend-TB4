package pe.edu.upc.trickfit.config.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService {
    public boolean insertar(Usuario usuario);
    public void eliminar(int idUsuario);
    List<Usuario> listar();
    Optional<Usuario> listarId(int idUsuario);
    List<Usuario> buscarUsuario(String nombreUsuario);
    List<Usuario> buscarDni(String dni);
    List<Usuario> buscarTipo(String nombreTipoUsuario);
}
