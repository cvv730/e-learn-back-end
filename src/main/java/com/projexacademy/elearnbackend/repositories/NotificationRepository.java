package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.Formation;
import com.projexacademy.elearnbackend.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
    List<Notification> findByUser_UserId(Long Id);

}
