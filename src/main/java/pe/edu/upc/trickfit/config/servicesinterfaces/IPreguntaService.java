package pe.edu.upc.trickfit.config.servicesinterfaces;

import pe.edu.upc.trickfit.entities.Pregunta;

import java.util.List;
import java.util.Optional;

public interface IPreguntaService {
    public boolean insertar(Pregunta pregunta);
    public void eliminar(int idPregunta);
    List<Pregunta> listar();
    Optional<Pregunta> listarId(int idPregunta);
    List<Pregunta> buscarPregunta(String tituloPregunta);
    List<Pregunta> buscarUsuario(String nombreUsuario);
}
