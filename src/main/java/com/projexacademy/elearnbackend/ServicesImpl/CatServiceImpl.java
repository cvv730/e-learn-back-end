package com.projexacademy.elearnbackend.ServicesImpl;

import com.projexacademy.elearnbackend.models.Cat;
import com.projexacademy.elearnbackend.repositories.CatRepository;
import com.projexacademy.elearnbackend.services.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CatServiceImpl  implements CatService {

   @Autowired
   private CatRepository catRepository ;
    @Override
    public List<Cat> getAllCategories() {
        return catRepository.findAll();
    }

    @Override
    public List<Cat> getAllCategoriesByFormationId(Long id) {
        return catRepository.findByFormations_FormationId(id);
    }

    @Override
    public Cat getById(Long id) {
        return catRepository.findById(id).get();
    }

    @Override
    public Cat addCategorie(Cat categorie) {
        return catRepository.save(categorie);
    }

    @Override
    public Cat updateCategorie(Cat categorie) {
        return catRepository.saveAndFlush(categorie);
    }

    @Override
    public boolean deleteCategorie(Long id) {
        catRepository.deleteById(id);
        return true;
    }
}
