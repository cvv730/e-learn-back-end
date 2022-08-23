package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.Apprenant;
import com.projexacademy.elearnbackend.models.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {
    List<Apprenant> findByFormations_FormationId(Long Id);
}
