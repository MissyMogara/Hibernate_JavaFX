package org.proyect.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.*;

@Entity //Mark as entity
@Getter //Autogenerate Getters with lombok
@Setter //Autogenerate Setters with lombok
@AllArgsConstructor //Constructor with all args with lombok
@NoArgsConstructor // Constructor without args with lombok
@ToString // Method to String with lombok
public class VideoGame {
    //PROPERTIES
    @Id //Mark as ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Autoincrement value
    private Long id;

    private String name;

    private String plataform;

    private Integer pegi;

    //private Categoria categoria;

    //CONSTRUCTOR
    public VideoGame(String name, String plataform, Integer pegi){
        this.name = name;
        this.plataform = plataform;
        this.pegi = pegi;
    }
}
