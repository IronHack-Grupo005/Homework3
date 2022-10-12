package com.ironhack.Homework3.pages.interfaces;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.Lead;
import com.ironhack.Homework3.models.Oportunity;
import com.ironhack.Homework3.models.SalesRep;
import com.ironhack.Homework3.repositories.CompanyRepo;
import com.ironhack.Homework3.repositories.LeadRepo;
import com.ironhack.Homework3.repositories.OportunityRepo;
import com.ironhack.Homework3.repositories.SalesRepRepo;

import java.util.List;

public interface CRMOptionsInterface {

    void newSalesRep(CompanyRepo companyRepo, SalesRepRepo salesRepRepo) ;
    void createLead(LeadRepo leadRepo, CompanyRepo companyRepo);
    void showLeads(LeadRepo leadRepo);
    Oportunity leadToOportunity(LeadRepo leadRepo, OportunityRepo oportunityRepo, CompanyRepo companyRepo);

    void showSalesRep(SalesRepRepo salesRepRepo);

    void newCompany(CompanyRepo companyRepo);
}
