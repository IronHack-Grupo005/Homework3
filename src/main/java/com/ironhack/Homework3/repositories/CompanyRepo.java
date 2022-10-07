package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
}
