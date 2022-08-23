package com.projexacademy.elearnbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity


public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long notificationId;
    private String titre;
    private String description;
    @CreatedDate
    private Date date_creation;
    private String userType;


    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "user_id", nullable = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User  user;
    public Notification(String titre, String description,String userType ,Date date_creation) {
        this.titre = titre;
        this.description = description;
        this.userType=userType;
        this.date_creation = date_creation;
    }

    public Notification(String titre, String description,String userType) {
        this.titre = titre;
        this.description = description;
        this.userType=userType;

    }

    public Notification(String titre, String description,String userType, Date date_creation, User user) {
        this.titre = titre;
        this.description = description;
        this.userType=userType;
        this.date_creation = date_creation;
        this.user = user;
    }

}
