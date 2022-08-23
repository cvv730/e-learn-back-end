
package com.projexacademy.elearnbackend.controllers;

import com.projexacademy.elearnbackend.models.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projexacademy.elearnbackend.services.FormationService;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/formations/")
public class FormationController {
    @Autowired
    private FormationService formationService;

    @GetMapping("")
    List<Formation> getAllFormations(){
        return this.formationService.getAllFormtions();
    }

    @PostMapping("add")
    public Formation addFormation(@RequestBody Formation formation){
        return formationService.addFormation(formation);
    }

    @PutMapping("update")
    public Formation updateFormation(@RequestBody Formation formation){
        return formationService.updateFormation(formation);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteFormation(@PathVariable Long id){
        return formationService.deleteFormation(id);
    }

    @GetMapping("formation/{id}")
    public Formation getById(@PathVariable Long id){
        return formationService.getById(id);
    }


    @GetMapping("formateur/{id}")
    public List<Formation> getByFormateurId(@PathVariable Long id){
        return formationService.getAllFormationsByFormateurId(id);
    }

    @GetMapping("apprenant/{id}")
    public List<Formation> getByApprenantId(@PathVariable Long id){
        return formationService.getAllFormationsByApprenantId(id);
    }
}

