package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.NotificationFormateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationFormateurRepository extends JpaRepository<NotificationFormateur,Long> {
    List<NotificationFormateur> findByFormateur_UserId(Long Id);
    void deleteByFormateur_UserId(Long id);
    void deleteAllByFormateur_UserId(Long id);

}
