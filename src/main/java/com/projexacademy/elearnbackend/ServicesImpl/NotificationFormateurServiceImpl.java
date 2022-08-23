package com.projexacademy.elearnbackend.ServicesImpl;

import com.projexacademy.elearnbackend.models.NotificationFormateur;
import com.projexacademy.elearnbackend.repositories.FormateurRepository;
import com.projexacademy.elearnbackend.repositories.NotificationFormateurRepository;
import com.projexacademy.elearnbackend.services.NotificationFormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationFormateurServiceImpl implements NotificationFormateurService {

    @Autowired
    private NotificationFormateurRepository notificationFormateurRepository;
    @Autowired
    private FormateurRepository formateurRepository;

    @Override
    public List<NotificationFormateur> getAllNotifications() {
        return notificationFormateurRepository.findAll();
    }

    @Override
    public List<NotificationFormateur> getAllNotificationsByFormateurId(Long id) {
        return notificationFormateurRepository.findByFormateur_UserId(id);
    }


    @Override
    public NotificationFormateur getNotification(Long id) {
        return notificationFormateurRepository.findById(id).get();
    }

    @Override
    public NotificationFormateur addNotificationByFormateurId(NotificationFormateur notificationFormateur, Long idFormateur) {
        NotificationFormateur notificationFormateur1=formateurRepository.findById(idFormateur).map(
                formateur -> {
                    notificationFormateur.setFormateur(formateur);
                    return notificationFormateurRepository.save(notificationFormateur);
                }).get();
         return notificationFormateur1;
    }

    @Override
    public NotificationFormateur updateNotification(NotificationFormateur notificationFormateur) {
        return notificationFormateurRepository.saveAndFlush(notificationFormateur);
    }

    @Override
    public boolean deleteNotification(Long id) {
        notificationFormateurRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteAllNotificationsByFormateurId(Long id) {
        notificationFormateurRepository.deleteAllByFormateur_UserId(id);
        return true;
    }
}
