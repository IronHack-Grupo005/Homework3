package com.ironhack.Homework3.repositories;

import com.ironhack.Homework3.models.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface LeadRepo extends JpaRepository<Lead,Long> {

void deleteById(long leadId);

//me falta query para eliminar LEAD si se convierte en CONTACT

}
