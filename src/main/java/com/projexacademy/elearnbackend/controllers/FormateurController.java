package com.projexacademy.elearnbackend.controllers;
import com.projexacademy.elearnbackend.models.Formateur;
import com.projexacademy.elearnbackend.repositories.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/formateurs/")
public class FormateurController {

    @Autowired
    private FormateurRepository formateurRepository;


    @GetMapping("")
    public List<Formateur> getAllFormateurs(){
        return formateurRepository.findAll();
    }

}
