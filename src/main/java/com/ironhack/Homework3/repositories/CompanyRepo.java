package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company,Integer> {


}
