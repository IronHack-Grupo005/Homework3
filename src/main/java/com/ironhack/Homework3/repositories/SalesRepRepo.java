package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.SalesRep;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepRepo extends JpaRepository<SalesRep,Integer> {
}
