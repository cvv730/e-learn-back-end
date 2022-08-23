package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.Formateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur,Long> {
    List<Formateur> findByFormations_FormationId(Long Id);

}
