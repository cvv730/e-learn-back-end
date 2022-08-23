package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.NotificationFormateur;

import java.util.List;

public interface NotificationFormateurService {
    List<NotificationFormateur> getAllNotifications();
    List<NotificationFormateur> getAllNotificationsByFormateurId(Long id);
    NotificationFormateur getNotification(Long id);
    NotificationFormateur addNotificationByFormateurId(NotificationFormateur notificationFormateur,Long idFormateur);
    NotificationFormateur updateNotification(NotificationFormateur notificationFormateur);
    boolean deleteNotification(Long id);
    boolean deleteAllNotificationsByFormateurId(Long id);


}
