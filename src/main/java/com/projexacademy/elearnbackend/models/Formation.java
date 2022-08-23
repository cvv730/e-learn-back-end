package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
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
    private List<Apprenant> apprenants;
@JsonIgnore
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
        name = "formation_formateur",
        joinColumns = @JoinColumn(name = "formationId"),
        inverseJoinColumns = @JoinColumn(name = "userId"))
   private List<Formateur> formateurs;



}
