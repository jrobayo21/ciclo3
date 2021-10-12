
package mintic.ciclo3.c3.service;

import java.util.List;
import java.util.Optional;
import mintic.ciclo3.c3.model.Cabaña;
import mintic.ciclo3.c3.repository.CabañaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabañaService {

//    public static Optional<Cabaña> getCabaña(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    @Autowired
    private CabañaRepository cabañaRepository;
    
    
    public List<Cabaña> getAll(){
        return cabañaRepository.getAll();
    }

    public Optional<Cabaña> getCabaña(int id){
        return cabañaRepository.getCabaña(id);
    }
    
    public Cabaña save(Cabaña cab){
        if(cab.getId()==null){
            return cabañaRepository.save(cab);
        }else{
            Optional<Cabaña> paux=cabañaRepository.getCabaña(cab.getId());
            if(paux.isEmpty()){
                return cabañaRepository.save(cab);
            }else{
                return cab;
            }
        }
    }
    
}
