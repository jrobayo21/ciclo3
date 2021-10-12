package mintic.ciclo3.c3.service;

import mintic.ciclo3.c3.model.Categoria;
import mintic.ciclo3.c3.model.Cabaña;
import mintic.ciclo3.c3.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return  categoriaRepository.getAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return categoriaRepository.getCategoria(id);
    }

    public Categoria save(Categoria cate){
        if(cate.getId()==null){
            return categoriaRepository.save(cate);
        }else{
            Optional<Categoria> paux=categoriaRepository.getCategoria(cate.getId());
            if(paux.isEmpty()){
                return categoriaRepository.save(cate);
            }else{
                return cate;
            }
        }
    }
}
