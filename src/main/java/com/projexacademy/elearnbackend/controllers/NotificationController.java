package com.projexacademy.elearnbackend.controllers;

import com.projexacademy.elearnbackend.models.Formation;
import com.projexacademy.elearnbackend.models.Notification;
import com.projexacademy.elearnbackend.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/notifications/")
public class NotificationController {
@Autowired
    private NotificationService notificationService;
    @GetMapping("")
    List<Notification> getAllNotifications(){
        return this.notificationService.getAllNotifications();
    }

    @PostMapping("add")
    public Notification addNotification(@RequestBody Notification notification){
        return notificationService.addNotification(notification);
    }

    @PutMapping("update")
    public Notification updateNotification(@RequestBody Notification notification){
        return notificationService.updateNotification(notification);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteNotification(@PathVariable Long id){
        return notificationService.deleteNotification(id);
    }

    @GetMapping("notification/{id}")
    public Notification getById(@PathVariable Long id){
        return notificationService.getById(id);
    }


    @GetMapping("user/{id}")
    public List<Notification> getByUserId(@PathVariable Long id){
        return notificationService.getAllNotificationsByUserId(id);
    }


}
