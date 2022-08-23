package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.Formation;

import java.util.List;

public interface FormationService {

    List<Formation> getAllFormtions();
    List<Formation> getAllFormationsByFormateurId(Long id);
    Formation getById(Long id);
    Formation addFormation(Formation formation);
    Formation updateFormation(Formation formation);
    boolean deleteFormation(Long id);


    }
