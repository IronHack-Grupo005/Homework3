package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.classes.Opportunity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpportinityRepository extends JpaRepository<Opportunity, Long> {

}
