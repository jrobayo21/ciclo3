package mintic.ciclo3.c3.repository;

import mintic.ciclo3.c3.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }
    public Optional<Cliente> getCliente(int id){
        return  clienteCrudRepository.findById(id);
    }

    public Cliente save(Cliente cli){
        return clienteCrudRepository.save(cli);
    }

}
