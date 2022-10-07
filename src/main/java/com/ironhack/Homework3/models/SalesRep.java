package com.ironhack.Homework3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SalesRep {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_salesRep;

    private String name;

    @OneToOne
    private Company company;
}
