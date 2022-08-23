package com.projexacademy.elearnbackend.ServicesImpl;

import com.projexacademy.elearnbackend.models.*;
import com.projexacademy.elearnbackend.repositories.ApprenantRepository;
import com.projexacademy.elearnbackend.repositories.FormateurRepository;
import com.projexacademy.elearnbackend.repositories.NotificationRepository;
import com.projexacademy.elearnbackend.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;
    @Autowired
    private FormateurRepository formateurRepository;
    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public List<Notification> getAllNotificationsByUserId(Long id) {
        return notificationRepository.findByUser_UserId(id);
    }

    @Override
    public Notification getById(Long id) {
        return notificationRepository.findById(id).get();
    }

    @Override
    public Notification addNotification(Notification notification) {
        System.out.println(notification.toString());
        User user=notification.getUser();
            System.out.println(notification.getUserType());
             if (notification.getUserType().equalsIgnoreCase(UserType.APPRENANT.value)){
             Apprenant apprenant=apprenantRepository.findById(user.getUserId()).get();

             apprenant.getNotifications().add(notification);

             apprenantRepository.saveAndFlush(apprenant);
         }else  if (notification.getUserType().equalsIgnoreCase(UserType.FORMATEUR.value)){
                 Formateur formateur=formateurRepository.findById(user.getUserId()).get();
             formateur.getNotifications().add(notification);

             formateurRepository.saveAndFlush(formateur);

         }else if (notification.getUserType().equalsIgnoreCase(UserType.ADMIN.value)){
                 //  To Do
         }
            return notificationRepository.save(notification);
    }

    @Override
    public Notification updateNotification(Notification notification) {
        return notificationRepository.saveAndFlush(notification);
    }

    @Override
    public boolean deleteNotification(Long id) {
        notificationRepository.deleteById(id);
        return true;
    }
}
