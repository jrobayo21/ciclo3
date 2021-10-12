package mintic.ciclo3.c3.service;

import mintic.ciclo3.c3.model.Mensaje;
import mintic.ciclo3.c3.repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    public List<Mensaje> getAll(){
        return mensajeRepository.getAll();
    }

    public Optional<Mensaje> getMensaje(int id){
        return mensajeRepository.getMensaje(id);
    }

    public Mensaje save(Mensaje men){
        if(men.getId()==null){
            return mensajeRepository.save(men);
        }else{
            Optional<Mensaje> paux=mensajeRepository.getMensaje(men.getId());
            if(paux.isEmpty()){
                return mensajeRepository.save(men);
            }else{
                return men;
            }
        }
    }

}
