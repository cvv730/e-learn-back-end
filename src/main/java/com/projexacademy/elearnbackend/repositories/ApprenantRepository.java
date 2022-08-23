package com.projexacademy.elearnbackend.repositories;

import com.projexacademy.elearnbackend.models.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant,Long> {

}
