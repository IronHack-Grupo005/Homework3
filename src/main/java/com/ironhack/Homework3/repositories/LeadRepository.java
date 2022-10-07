package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.classes.Leads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<Leads, Long> {
}
