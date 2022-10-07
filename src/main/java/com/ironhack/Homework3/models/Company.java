package com.ironhack.Homework3.models;

import com.ironhack.Homework3.models.enums.Industry;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_company;

    private int numberEmployees;

    private String city;

    private Industry industry;

    @ManyToMany
    @JoinTable(
            name = "company_contact",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "contact_id"))
    private Set<Contact> contactList;

    @ManyToMany
    @JoinTable(
            name = "company_oportunities",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "oportunity_id"))
    private Set<Oportunity> oportunitiesList;





}
