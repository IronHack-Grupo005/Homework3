package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.classes.Leads;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LeadRepository extends JpaRepository<Leads, Long> {

    Optional<Leads>findByName(String name);

    @Query(value = "Select * from lead", nativeQuery = true)
    List<Leads> findAll();


}
