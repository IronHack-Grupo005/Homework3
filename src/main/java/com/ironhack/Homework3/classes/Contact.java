package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.enums.Industry;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Industry industry;

    private int employeeCount;
    private String city;


    //List<Contact> contactos = new ArrayList<>();
    //List<Opportunity> oportunidades = new ArrayList<>();



}
