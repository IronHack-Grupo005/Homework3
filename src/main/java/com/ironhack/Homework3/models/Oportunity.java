package com.ironhack.Homework3.models;

import com.ironhack.Homework3.models.enums.ProductType;
import com.ironhack.Homework3.models.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Oportunity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long oportunity_id;

    private ProductType product;

    @OneToOne
    private Contact decisionMaker;

    @Enumerated(EnumType.ORDINAL)
    private Status status;

    @ManyToMany
    @JoinTable(
            name = "oportunities_company",
            joinColumns = @JoinColumn(name = "oport_id"),
            inverseJoinColumns = @JoinColumn(name = "company_id"))
    private Set<Company> oprtunities;

    @OneToOne
    @JoinColumn(name = "id_salesRep")
    private SalesRep salesRep;

}
