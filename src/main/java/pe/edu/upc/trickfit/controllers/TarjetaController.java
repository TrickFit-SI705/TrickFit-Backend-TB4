package pe.edu.upc.trickfit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.trickfit.entities.Tarjeta;
import pe.edu.upc.trickfit.config.servicesinterfaces.ITarjetaService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarjetas")
public class TarjetaController {

    @Autowired
    private ITarjetaService pService;

    @PostMapping
    public void registrar(@RequestBody Tarjeta t) {
        pService.insertar(t);
    }

    @GetMapping
    public List<Tarjeta> listar() {
        return pService.listar();
    }

    @PutMapping
    public void modificar(@RequestBody Tarjeta t) {
        pService.insertar(t);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pService.eliminar(id);
    }

    @PostMapping("/buscar")
    public List<Tarjeta> buscar(@RequestBody Tarjeta t) throws ParseException {

        List<Tarjeta> listaTarjetas;
        listaTarjetas = pService.buscarTarjeta(t.getNumeroTarjeta());
        if (listaTarjetas.isEmpty()) {

            listaTarjetas = pService.buscarBanco(t.getBanco().getNombreBanco());
        }
        return listaTarjetas;

    }
    @GetMapping("/{id}")
    public Optional<Tarjeta> listarId(@PathVariable("id") Integer id) {
        return pService.listarId(id);
    }
}
