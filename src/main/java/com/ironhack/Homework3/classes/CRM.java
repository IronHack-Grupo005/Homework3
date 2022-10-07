package com.ironhack.Homework3.classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class CRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "lead")
    List<Lead> leads;
    @OneToMany
    List<Opportunity> oppors;

    private static int countLeads = 0;

    public CRM() {
    }

    public CRM(Long id, List<Lead> leads, List<Opportunity> oppors) {
        this.id = id;
        this.leads = leads;
        this.oppors = oppors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Lead> getLeads() {
        return leads;
    }

    public void setLeads(List<Lead> leads) {
        this.leads = leads;
    }

    public List<Opportunity> getOppors() {
        return oppors;
    }

    public void setOppors(List<Opportunity> oppors) {
        this.oppors = oppors;
    }

    public static int getCountLeads() {
        return countLeads;
    }

    public static void setCountLeads(int countLeads) {
        CRM.countLeads = countLeads;
    }
}
