package com.projexacademy.elearnbackend.ServicesImpl;


import com.projexacademy.elearnbackend.models.NotificationApprenant;
import com.projexacademy.elearnbackend.repositories.ApprenantRepository;
import com.projexacademy.elearnbackend.repositories.NotificationApprenantRepository;
import com.projexacademy.elearnbackend.services.NotificationApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationApprenantServiceImpl implements NotificationApprenantService {

    @Autowired
    private NotificationApprenantRepository notificationApprenantRepository;
    @Autowired
    private ApprenantRepository apprenantRepository;

    @Override
    public List<NotificationApprenant> getAllNotifications() {
        return notificationApprenantRepository.findAll();
    }

    @Override
    public List<NotificationApprenant> getAllNotificationsByApprenantId(Long id) {
        return notificationApprenantRepository.findByApprenant_UserId(id);
    }


    @Override
    public NotificationApprenant getNotification(Long id) {
        return notificationApprenantRepository.findById(id).get();
    }

    @Override
    public NotificationApprenant addNotificationByApprenantId(NotificationApprenant notificationApprenant, Long idApprenant) {
        NotificationApprenant notificationApprenant1 = apprenantRepository.findById(idApprenant).map(
                apprenant -> {
                    notificationApprenant.setApprenant(apprenant);
                    return notificationApprenantRepository.save(notificationApprenant);
                }).get();
        return notificationApprenant1;
    }

    @Override
    public NotificationApprenant updateNotification(NotificationApprenant notificationApprenant) {
        return notificationApprenantRepository.saveAndFlush(notificationApprenant);
    }

    @Override
    public boolean deleteNotification(Long id) {
        notificationApprenantRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteAllNotificationsByApprenantId(Long id) {
        notificationApprenantRepository.deleteAllByApprenant_UserId(id);
        return true;
    }
}
