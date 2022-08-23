package com.projexacademy.elearnbackend.controllers;
import com.projexacademy.elearnbackend.models.Admin;
import com.projexacademy.elearnbackend.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/admins/")
public class AdminController {


    @Autowired
    private AdminRepository adminRepository;


    @GetMapping("")
    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }
}
