package com.projexacademy.elearnbackend.services;


import com.projexacademy.elearnbackend.models.Formateur;

import java.util.List;

public interface FormateurService {

    List<Formateur> getAllFormateurs();
    List<Formateur> getAllFormateursByFormationId(Long id);
    Formateur getById(Long id);
    Formateur addFormateur(Formateur formateur);
    Formateur updateFormateur(Formateur formateur);
    boolean deleteFormateur(Long id);


}
