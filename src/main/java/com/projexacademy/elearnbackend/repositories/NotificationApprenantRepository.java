package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.NotificationApprenant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationApprenantRepository extends JpaRepository<NotificationApprenant,Long> {
    List<NotificationApprenant> findByApprenant_UserId(Long Id);
    void deleteByApprenant_UserId(Long id);
    void deleteAllByApprenant_UserId(Long id);

}
