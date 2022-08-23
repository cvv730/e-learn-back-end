package com.projexacademy.elearnbackend.controllers;


import com.projexacademy.elearnbackend.models.NotificationApprenant;
import com.projexacademy.elearnbackend.services.NotificationApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notificationsApprenant/")
public class NotificationApprenantController {
    @Autowired
    private NotificationApprenantService notificationApprenantService;


    @GetMapping("")
    List<NotificationApprenant> getAllNotifications(){
        return notificationApprenantService.getAllNotifications();
    }
    @GetMapping("apprenant/{id}")
    List<NotificationApprenant> getAllNotificationsByApprenantId(@PathVariable Long id){
        return notificationApprenantService.getAllNotificationsByApprenantId(id);
    }
    @GetMapping("{id}")
    NotificationApprenant getNotification(@PathVariable Long id){
        return notificationApprenantService.getNotification(id);
    }
    @PostMapping("add/apprenant/{idApprenant}")
    NotificationApprenant addNotificationByApprenantId(@RequestBody NotificationApprenant notificationApprenant,
                                                       @PathVariable Long idApprenant){
        return notificationApprenantService.addNotificationByApprenantId(notificationApprenant,idApprenant);
    }
    @PutMapping("/update")
    NotificationApprenant updateNotification(@RequestBody NotificationApprenant notificationApprenant){
        return notificationApprenantService.updateNotification(notificationApprenant);
    }
    @DeleteMapping("delete/{id}")
    boolean deleteNotification(@PathVariable Long id){
        return notificationApprenantService.deleteNotification(id);
    }
    @DeleteMapping("delete/apprenant/{id}")
    boolean deleteAllNotificationsByFormteurId(@PathVariable Long id){
        return notificationApprenantService.deleteAllNotificationsByApprenantId(id);
    }
}
