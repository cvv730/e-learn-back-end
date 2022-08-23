package com.projexacademy.elearnbackend.controllers;


import com.projexacademy.elearnbackend.models.Cat;
import com.projexacademy.elearnbackend.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categories/")
public class CatController {

    @Autowired
    private CatService catService;

    @PostMapping("add")
    public Cat addCategorie(@RequestBody Cat categorie){
        return catService.addCategorie(categorie);
    }

    @PutMapping("update")
    public Cat updateCategorie(@RequestBody Cat categorie){
        return catService.updateCategorie(categorie);
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteCategorie(@PathVariable Long id){
        return catService.deleteCategorie(id);
    }

    @GetMapping("categorie/{id}")
    public Cat getById(@PathVariable Long id){
        return catService.getById(id);
    }

    @GetMapping("")
    public List<Cat> getAllCategories(){
        return catService.getAllCategories();
    }

    @GetMapping("formation/{id}")
    public List<Cat> getByFormationId(@PathVariable Long id){
        return catService.getAllCategoriesByFormationId(id);
    }

}
