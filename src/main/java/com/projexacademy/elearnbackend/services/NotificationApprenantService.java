package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.NotificationApprenant;

import java.util.List;

public interface NotificationApprenantService {
    List<NotificationApprenant> getAllNotifications();
    List<NotificationApprenant> getAllNotificationsByApprenantId(Long id);
    NotificationApprenant getNotification(Long id);
    NotificationApprenant addNotificationByApprenantId(NotificationApprenant notificationApprenant,Long idApprenant);
    NotificationApprenant updateNotification(NotificationApprenant notificationApprenant);
    boolean deleteNotification(Long id);
    boolean deleteAllNotificationsByApprenantId(Long id);


}
