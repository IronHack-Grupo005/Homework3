package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.enums.Industry;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    Industry industry;

    private int employeeCount;
    private String city;

    //@OneToOne
    //private Opportunity decisionMaker_id;
    //List<Contact> contactos = new ArrayList<>();
    //List<Opportunity> oportunidades = new ArrayList<>();



}
