package com.projexacademy.elearnbackend.controllers;
import com.projexacademy.elearnbackend.models.Apprenant;
import com.projexacademy.elearnbackend.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/apprenants/")
public class ApprenantController {


    @Autowired
    private ApprenantRepository apprenantRepository;


    @GetMapping("")
    public List<Apprenant> getAllApprenants(){
        return apprenantRepository.findAll();
    }
}
