package com.projexacademy.elearnbackend.controllers;
import com.projexacademy.elearnbackend.models.Apprenant;
import com.projexacademy.elearnbackend.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/apprenants/")
public class ApprenantController {

    @Autowired
    private ApprenantService apprenantService;

    @PostMapping("add")
    public Apprenant addApprenant(@RequestBody Apprenant apprenant){
        return apprenantService.addApprenant(apprenant);
    }

    @PutMapping("update")
    public Apprenant updateApprenant(@RequestBody Apprenant apprenant){
        return apprenantService.updateApprenant(apprenant);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteApprenant(@PathVariable Long id){
        return apprenantService.deleteApprenant(id);
    }

    @GetMapping("apprenant/{id}")
    public Apprenant getById(@PathVariable Long id){
        return apprenantService.getById(id);
    }

    @GetMapping("")
    public List<Apprenant> getAllApprenants(){
        return apprenantService.getAllApprenants();
    }

    @GetMapping("formation/{id}")
    public List<Apprenant> getByFormationId(@PathVariable Long id){
        return apprenantService.getAllApprenantsByFormationId(id);
    }


}
