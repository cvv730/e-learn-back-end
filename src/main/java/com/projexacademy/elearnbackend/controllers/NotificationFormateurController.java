package com.projexacademy.elearnbackend.controllers;


import com.projexacademy.elearnbackend.models.NotificationFormateur;
import com.projexacademy.elearnbackend.services.NotificationFormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificationsFormateur/")
public class NotificationFormateurController {
    @Autowired
    private NotificationFormateurService notificationFormateurService;


    @GetMapping("")
    List<NotificationFormateur> getAllNotifications(){
        return notificationFormateurService.getAllNotifications();
    }
    @GetMapping("formateur/{id}")
    List<NotificationFormateur> getAllNotificationsByFormateurId(@PathVariable Long id){
        return notificationFormateurService.getAllNotificationsByFormateurId(id);
    }
    @GetMapping("{id}")
    NotificationFormateur getNotification(@PathVariable Long id){
        return notificationFormateurService.getNotification(id);
    }
    @PostMapping("add/formateur/{idFormateur}")
    NotificationFormateur addNotificationByFormateurId(@RequestBody NotificationFormateur notificationFormateur,
                                                       @PathVariable Long idFormateur){
        return notificationFormateurService.addNotificationByFormateurId(notificationFormateur,idFormateur);
    }
    @PutMapping("/update")
    NotificationFormateur updateNotification(@RequestBody NotificationFormateur notificationFormateur){
        return notificationFormateurService.updateNotification(notificationFormateur);
    }
    @DeleteMapping("delete/{id}")
    boolean deleteNotification(@PathVariable Long id){
       return notificationFormateurService.deleteNotification(id);
    }
    @DeleteMapping("delete/formateur/{id}")
    boolean deleteAllNotificationsByFormteurId(@PathVariable Long id){
       return notificationFormateurService.deleteAllNotificationsByFormateurId(id);
    }
}
