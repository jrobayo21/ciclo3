package mintic.ciclo3.c3.repository;

import mintic.ciclo3.c3.model.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeCrudRepository extends CrudRepository<Mensaje,Integer> {
}
