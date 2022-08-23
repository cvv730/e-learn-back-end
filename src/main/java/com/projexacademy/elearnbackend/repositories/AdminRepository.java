package com.projexacademy.elearnbackend.repositories;
import com.projexacademy.elearnbackend.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
