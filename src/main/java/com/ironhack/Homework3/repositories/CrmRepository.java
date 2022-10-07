package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.classes.CRM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrmRepository extends JpaRepository<CRM, Long> {

}
