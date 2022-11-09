package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Usuario;
import pe.edu.upc.trickfit.config.servicesinterfaces.IUsuarioService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService pService;

    @PostMapping
    public void registrar(@RequestBody Usuario u) {
        pService.insertar(u);
    }

    @GetMapping
    public List<Usuario> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Usuario u) {
        pService.insertar(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Usuario> buscar(@RequestBody Usuario u) throws ParseException {

        List<Usuario> listaUsuarios;
        listaUsuarios = pService.buscarUsuario(u.getNombreUsuario());
        if (listaUsuarios.isEmpty()) {
            listaUsuarios = pService.buscarDni(u.getDNI());
        }
        if (listaUsuarios.isEmpty()) {
            listaUsuarios = pService.buscarTipo(u.getTipo_usuario().getNombreTipoUsuario());
        }
        return listaUsuarios;

    }
    @GetMapping("/{id}")
    public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }

}
