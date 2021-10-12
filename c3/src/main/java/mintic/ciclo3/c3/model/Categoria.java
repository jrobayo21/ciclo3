package mintic.ciclo3.c3.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Entity
@Table(name="Category")
@Data
public class Categoria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

//    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
//    @JsonIgnoreProperties("category")
//    private List<Cabaña> cabañas;


    
}
