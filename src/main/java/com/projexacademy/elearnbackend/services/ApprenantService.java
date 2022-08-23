package com.projexacademy.elearnbackend.services;

import com.projexacademy.elearnbackend.models.Apprenant;

import java.util.List;

public interface ApprenantService {
    List<Apprenant> getAllApprenants();
    List<Apprenant> getAllApprenantsByFormationId(Long id);
    Apprenant getById(Long id);
    Apprenant addApprenant(Apprenant apprenant);
    Apprenant updateApprenant(Apprenant apprenant);
    boolean deleteApprenant(Long id);


}
