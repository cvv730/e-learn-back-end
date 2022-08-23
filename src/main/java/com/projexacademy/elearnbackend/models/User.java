package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="user_x_type")
//@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "type")
//@JsonSubTypes({@JsonSubTypes.Type(value = Apprenant.class, name = "apprenant"),
//@JsonSubTypes.Type(value = Formateur.class, name = "formateur")})

public abstract class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;
   private String nom ;

   @Embedded
   private Adresse adresse;
    private String prenom ;
    private String email ;
    private String tel ;
    private Date date_naiss ;
    private String pass ;
    private String ncin ;
    private String pseudo ;
    private String userType;

    public User(String nom, String prenom, String email, String tel, Date date_naiss, String pass, String ncin, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.date_naiss = date_naiss;
        this.pass = pass;
        this.ncin = ncin;
        this.pseudo = pseudo;

    }
}
