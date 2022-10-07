package com.ironhack.Homework3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    private String name;

    private String phoneNumber;

    private String email;

    @OneToMany
    private List<Lead> leadList;

    @OneToOne
    @JoinColumn(name = "id_salesRep")
    private SalesRep salesRep;


}
