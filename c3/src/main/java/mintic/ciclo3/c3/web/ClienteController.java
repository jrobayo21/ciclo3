package mintic.ciclo3.c3.web;


import mintic.ciclo3.c3.model.Cliente;
import mintic.ciclo3.c3.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/all")
    public List<Cliente> getClientes(){
        return clienteService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable("id") int id){
        return clienteService.getCliente(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cli){
        return clienteService.save(cli);
    }




}
