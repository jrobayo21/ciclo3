
package mintic.ciclo3.c3.web;


import mintic.ciclo3.c3.model.Cabaña;
import mintic.ciclo3.c3.service.CabañaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cabin")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CabañaController {
    
    
    @Autowired
    private CabañaService cabañaService;

    @GetMapping("/all")
    public List<Cabaña> getCabañas(){
        return cabañaService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Cabaña> getCabaña(@PathVariable("id") int id){
        return cabañaService.getCabaña(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabaña save(@RequestBody Cabaña cab){
        return cabañaService.save(cab);
    }
    
    
}
