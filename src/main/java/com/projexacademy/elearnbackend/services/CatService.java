package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.Cat;
import com.projexacademy.elearnbackend.models.Formateur;

import java.util.List;

public interface CatService {

    List<Cat> getAllCategories();
    List<Cat> getAllCategoriesByFormationId(Long id);
    Cat getById(Long id);
    Cat addCategorie(Cat categorie);
    Cat updateCategorie(Cat categorie);
    boolean deleteCategorie(Long id);


}
