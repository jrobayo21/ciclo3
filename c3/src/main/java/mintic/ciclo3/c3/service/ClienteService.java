package mintic.ciclo3.c3.service;

import mintic.ciclo3.c3.model.Cliente;
import mintic.ciclo3.c3.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll(){
        return clienteRepository.getAll();
    }

    public Optional<Cliente> getCliente(int id){
        return clienteRepository.getCliente(id);
    }

    public Cliente save(Cliente cli){
        if(cli.getId()==null){
            return clienteRepository.save(cli);
        }else{
            Optional<Cliente> paux=clienteRepository.getCliente(cli.getId());
            if(paux.isEmpty()){
                return clienteRepository.save(cli);
            }else{
                return cli;
            }
        }
    }

}
