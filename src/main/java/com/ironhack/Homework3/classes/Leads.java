package com.ironhack.Homework3.classes;

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
public class Leads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "crm_id_lead")
    private CRM crmLead;

    private String name;
    private String phoneNumber;
    private String email;
    private String companyName;

    public CRM getCrmLead() {
        return crmLead;
    }

    public void setCrmLead(CRM crmLead) {
        this.crmLead = crmLead;
    }

    public Leads(String name, String phoneNumber, String email, String companyName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.companyName = companyName;
    }
}
