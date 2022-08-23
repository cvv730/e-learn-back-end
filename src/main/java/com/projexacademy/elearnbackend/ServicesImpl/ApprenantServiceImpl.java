package com.projexacademy.elearnbackend.ServicesImpl;

import com.projexacademy.elearnbackend.models.Apprenant;
import com.projexacademy.elearnbackend.repositories.ApprenantRepository;
import com.projexacademy.elearnbackend.services.ApprenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantServiceImpl implements ApprenantService {
    @Autowired
    private ApprenantRepository apprenantRepository;

    @Override
    public List<Apprenant> getAllApprenants() {
        return apprenantRepository.findAll();
    }

    @Override
    public List<Apprenant> getAllApprenantsByFormationId(Long id) {
        return apprenantRepository.findByFormations_FormationId(id);
    }

    @Override
    public Apprenant getById(Long id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public Apprenant addApprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant updateApprenant(Apprenant apprenant) {
        return apprenantRepository.saveAndFlush(apprenant);
    }

    @Override
    public boolean deleteApprenant(Long id) {
        apprenantRepository.deleteById(id);
        return true;
    }
}
