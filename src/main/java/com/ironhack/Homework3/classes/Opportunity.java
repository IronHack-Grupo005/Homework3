package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.enums.*;
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
public class Opportunity extends Leads{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CRM crmOppor;



    Product industry;
    private int number;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "decisionMaker_id", referencedColumnName = "id")
    Contact decisionMaker;

    Status status;

    public CRM getCrmOppor() {
        return crmOppor;
    }

    public void setCrmOppor(CRM crmOppor) {
        this.crmOppor = crmOppor;
    }

}
