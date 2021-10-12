package mintic.ciclo3.c3.model;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Entity
@Table(name = "Client")
@Data
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Integer age;
    private String password;



}