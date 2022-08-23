package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.Notification;

import java.util.List;

public interface NotificationService {

    List<Notification> getAllNotifications();
    List<Notification> getAllNotificationsByUserId(Long id);
    Notification getById(Long id);
    Notification addNotification(Notification notification);
    Notification updateNotification(Notification notification);
    boolean deleteNotification(Long id);


}
