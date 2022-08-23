package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.Cat;
import com.projexacademy.elearnbackend.models.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat,Long> {

    List<Cat> findByFormations_FormationId(Long Id);


}
