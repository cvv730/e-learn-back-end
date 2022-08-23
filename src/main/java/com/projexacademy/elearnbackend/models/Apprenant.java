package com.projexacademy.elearnbackend.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("apprenant")
/*@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "userId")
        */


public class Apprenant extends User {
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "formation_apprenant",
            joinColumns = @JoinColumn(name = "userId"),
            inverseJoinColumns = @JoinColumn(name = "formationId"))
    private List<Formation> formations;


    public Apprenant(String nom, String prenom, String email, String tel, Date date, String pass, String ncin, String pseudo) {
        super(nom,prenom,email,tel,date,pass,ncin,pseudo);

        }
}
