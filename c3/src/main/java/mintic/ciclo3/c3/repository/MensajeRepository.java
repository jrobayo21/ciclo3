package mintic.ciclo3.c3.repository;

import mintic.ciclo3.c3.model.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MensajeRepository {

    @Autowired
    private MensajeCrudRepository mensajeCrudRepository;

    public List<Mensaje> getAll(){
        return (List<Mensaje>) mensajeCrudRepository.findAll();
    }
    public Optional<Mensaje> getMensaje(int id){
        return  mensajeCrudRepository.findById(id);
    }

    public Mensaje save(Mensaje men){
        return mensajeCrudRepository.save(men);
    }

}
