package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.Oportunity;
import com.ironhack.Homework3.models.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OportunityRepo extends JpaRepository<Oportunity,Long> {


    List<Oportunity> findByStatus(Status status);
}
