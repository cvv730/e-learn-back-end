package com.projexacademy.elearnbackend.controllers;
import com.projexacademy.elearnbackend.models.Formateur;
import com.projexacademy.elearnbackend.models.Formation;
import com.projexacademy.elearnbackend.services.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/formateurs/")
public class FormateurController {

    @Autowired
    private FormateurService formateurService;

    @PostMapping("add")
    public Formateur addFormateur(@RequestBody Formateur formateur){
        return formateurService.addFormateur(formateur);
    }

    @PutMapping("update")
    public Formateur updateFormateur(@RequestBody Formateur formateur){
        return formateurService.updateFormateur(formateur);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteFormateur(@PathVariable Long id){
        return formateurService.deleteFormateur(id);
    }

    @GetMapping("formateur/{id}")
    public Formateur getById(@PathVariable Long id){
        return formateurService.getById(id);
    }

    @GetMapping("")
    public List<Formateur> getAllFormateurs(){
        return formateurService.getAllFormateurs();
    }

    @GetMapping("formation/{id}")
    public List<Formateur> getByFormationId(@PathVariable Long id){
        return formateurService.getAllFormateursByFormationId(id);
    }

}
