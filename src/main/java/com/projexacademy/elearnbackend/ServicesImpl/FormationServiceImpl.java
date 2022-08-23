package com.projexacademy.elearnbackend.ServicesImpl;
import com.projexacademy.elearnbackend.models.Formation;
import com.projexacademy.elearnbackend.repositories.FormationRepository;
import com.projexacademy.elearnbackend.services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormationServiceImpl implements FormationService {
    @Autowired
    private FormationRepository formationRepository;
    @Override
    public List<Formation> getAllFormtions() {
        return formationRepository.findAll();
    }

    @Override
    public List<Formation> getAllFormationsByFormateurId(Long id) {

        return formationRepository.findByFormateurs_UserId(id);
    }

    @Override
    public Formation getById(Long id) {
        return formationRepository.findById(id).get();
    }

    @Override
    public Formation addFormation(Formation formation) {
        return formationRepository.save(formation);
    }

    @Override
    public Formation updateFormation(Formation formation) {
        return formationRepository.saveAndFlush(formation);
    }

    @Override
    public boolean deleteFormation(Long id) {
        formationRepository.deleteById(id);
        return true;
    }
}
