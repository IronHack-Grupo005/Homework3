package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.enums.*;
import javax.persistence.*;

@Entity
public class Opportunity extends Leads{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "crm_id")
    private CRM crm;

    Product industry;
    private int number;
    //@OneToOne(mappedBy = "id", fetch = FetchType.EAGER)

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "decisionMaker_id", referencedColumnName = "id")
    Contact decisionMaker;
    Status status;

    public Opportunity() {
    }

    public Opportunity(Long id, Opportunity oppor, Product industry, int number, Contact decisionMaker, Status status) {
        this.id = id;
        this.industry = industry;
        this.number = number;
        this.decisionMaker = decisionMaker;
        this.status = status;
    }

    public CRM getCrm() {
        return crm;
    }

    public void setCrm(CRM crm) {
        this.crm = crm;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getIndustry() {
        return industry;
    }

    public void setIndustry(Product industry) {
        this.industry = industry;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Contact getDecisionMaker() {
        return decisionMaker;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
