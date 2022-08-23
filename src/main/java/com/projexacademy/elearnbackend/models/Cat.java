package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
/*
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "formationId")
 */

public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catId;
    private String titre;



    private String description;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "formation_catalogue",
            joinColumns = @JoinColumn(name = "catId"),
            inverseJoinColumns = @JoinColumn(name = "formationId"))
private List<Formation> formations=new ArrayList<>();

    public Cat(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }

    public Cat(String titre, String description, List<Formation> formations) {
        this.titre = titre;
        this.description = description;
        this.formations = formations;
    }
}
