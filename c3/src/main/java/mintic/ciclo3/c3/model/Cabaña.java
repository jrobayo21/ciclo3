package mintic.ciclo3.c3.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name="Cabin")
@Data
public class Cabaña implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private Integer rooms;
    private Integer category_id;
    private String name;
    private String description;


//    @ManyToOne
//    @JoinColumn(name="category_id")
////    @JsonIgnoreProperties("cabin")
//      private Cabaña cabaña;

    
}
