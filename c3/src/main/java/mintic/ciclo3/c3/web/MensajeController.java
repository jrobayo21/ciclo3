package mintic.ciclo3.c3.web;


import mintic.ciclo3.c3.model.Mensaje;
import mintic.ciclo3.c3.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping("/all")
    public List<Mensaje> getMensajes(){
        return mensajeService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Mensaje> getMensaje(@PathVariable("id") int id){
        return mensajeService.getMensaje(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje men){
        return mensajeService.save(men);
    }




}
