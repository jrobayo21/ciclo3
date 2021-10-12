package mintic.ciclo3.c3.model;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name="Message")
@Data
public class Mensaje implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cabin;
    private String messagetext;
    




    
}


    
