package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {


}
