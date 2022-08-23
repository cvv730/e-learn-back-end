package com.projexacademy.elearnbackend.models;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
//@DiscriminatorValue("admin")
public class Admin extends User {
    //private String userType=UserType.ADMIN.value;
    public Admin(String nom, String prenom, String email, String tel, Date date, String pass, String ncin, String pseudo) {
        super(nom,prenom,email,tel,date,pass,ncin,pseudo);
        this.setUserType(UserType.ADMIN.value);

    }
}
