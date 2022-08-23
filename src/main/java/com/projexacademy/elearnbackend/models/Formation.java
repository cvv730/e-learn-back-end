package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
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

public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long formationId;
    private String titre;
    private String description;
    @CreatedDate
    private Date date_creation;
    private int duree;
    @JsonIgnore
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
        name = "formation_apprenant",
        joinColumns = @JoinColumn(name = "formationId"),
        inverseJoinColumns = @JoinColumn(name = "userId"))
    private List<Apprenant> apprenants= new ArrayList<>();
@JsonIgnore
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
        name = "formation_formateur",
        joinColumns = @JoinColumn(name = "formationId"),
        inverseJoinColumns = @JoinColumn(name = "userId"))
   private List<Formateur> formateurs=new ArrayList<>();

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "formation_catalogue",
            joinColumns = @JoinColumn(name = "formationId"),
            inverseJoinColumns = @JoinColumn(name = "catId"))
private List<Cat> catalogues= new ArrayList<>();

    public Formation(String titre, String description, Date date_creation, int duree) {
        this.titre = titre;
        this.description = description;
        this.date_creation = date_creation;
        this.duree = duree;
    }
}
