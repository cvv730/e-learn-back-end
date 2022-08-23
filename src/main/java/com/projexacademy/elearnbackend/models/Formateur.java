package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@DiscriminatorValue("formateur")
/*
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "userId")
*/
public class Formateur extends User  {

    private String spec ;
    private String grade ;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "formation_formateur",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "formationId"))
    private List<Formation> formations;


    public Formateur(String nom, String prenom, String email, String tel, Date date, String pass, String ncin, String pseudo, String spec, String grade) {
        super(nom,prenom,email,tel,date,pass,ncin,pseudo);
        this.spec=spec;
        this.grade=grade;

    }


}