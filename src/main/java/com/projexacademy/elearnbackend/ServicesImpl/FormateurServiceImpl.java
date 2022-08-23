package com.projexacademy.elearnbackend.ServicesImpl;

import com.projexacademy.elearnbackend.models.Formateur;
import com.projexacademy.elearnbackend.repositories.FormateurRepository;
import com.projexacademy.elearnbackend.services.FormateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormateurServiceImpl implements FormateurService {
    @Autowired
    private FormateurRepository formateurRepository;
    @Override
    public List<Formateur> getAllFormateurs() {
        return formateurRepository.findAll();
    }

    @Override
    public List<Formateur> getAllFormateursByFormationId(Long id) {
        return formateurRepository.findByFormations_FormationId(id);
    }

    @Override
    public Formateur getById(Long id) {
        return formateurRepository.findById(id).get();
    }

    @Override
    public Formateur addFormateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public Formateur updateFormateur(Formateur formateur) {
        return formateurRepository.saveAndFlush(formateur);
    }

    @Override
    public boolean deleteFormateur(Long id) {
        formateurRepository.deleteById(id);
        return true;
    }
}
