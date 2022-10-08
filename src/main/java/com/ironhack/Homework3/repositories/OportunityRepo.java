package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.Oportunity;
import com.ironhack.Homework3.models.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OportunityRepo extends JpaRepository<Oportunity,Long> {


    List<Oportunity> findByStatus(Status status);
}
