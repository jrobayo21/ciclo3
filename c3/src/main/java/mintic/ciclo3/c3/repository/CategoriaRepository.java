package mintic.ciclo3.c3.repository;

import mintic.ciclo3.c3.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {
    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
    public Optional<Categoria>getCategoria(int id){
        return categoriaCrudRepository.findById(id);
    }
    public Categoria save(Categoria cate){
        return categoriaCrudRepository.save(cate);
    }
}
