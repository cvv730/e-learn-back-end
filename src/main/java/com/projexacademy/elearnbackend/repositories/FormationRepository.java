
package com.projexacademy.elearnbackend.repositories;


import com.projexacademy.elearnbackend.models.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormationRepository extends  JpaRepository<Formation,Long>  {
    List<Formation> findByFormateurs_UserId(Long Id);
}
