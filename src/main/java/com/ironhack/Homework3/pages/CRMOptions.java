package com.ironhack.Homework3.pages;

import com.ironhack.Homework3.Homework3Application;
import com.ironhack.Homework3.models.*;
import com.ironhack.Homework3.models.enums.Industry;
import com.ironhack.Homework3.models.enums.Status;
import com.ironhack.Homework3.pages.interfaces.CRMOptionsInterface;
import com.ironhack.Homework3.repositories.CompanyRepo;
import com.ironhack.Homework3.repositories.LeadRepo;
import com.ironhack.Homework3.repositories.OportunityRepo;
import com.ironhack.Homework3.repositories.SalesRepRepo;

import java.util.*;

public class CRMOptions implements CRMOptionsInterface {

    private SalesRep salesRep = new SalesRep();
    private Scanner scanner = new Scanner(System.in);

    private Homework3Application homework3Application = new Homework3Application();
    private Company company = new Company();

    private Lead lead = new Lead();
    private Oportunity oportunity = new Oportunity();

    public CRMOptions() {}

    public void newSalesRep(CompanyRepo companyRepo, SalesRepRepo salesRepRepo) throws IllegalFormatException {
    try {
        System.out.println("Introduce un nombre del representante de ventas: ");
        salesRep.setName(scanner.nextLine());
        System.out.println("Introduce el id de la compañia: ");
        int companyId  = scanner.nextInt();

        if (salesRepRepo.findById(companyId).isPresent()) {
            company = companyRepo.findById(companyId).get();
            salesRepRepo.save(new SalesRep(salesRep.getName(),company));
            System.out.println("Nuevo representante introducide correctamente");
        } else {
            System.out.println("Compañia no existente");
        }
    } catch(IllegalFormatException e) {
            System.out.println(e.getMessage());
    }

    }

    @Override
    public void createLead(LeadRepo leadRepo, CompanyRepo companyRepo) {
        try {
            System.out.println("Introduce un nombre del lead: ");
            lead.setName(scanner.nextLine());
            System.out.println("Introduce el teléfono del lead: ");
            lead.setPhoneNumber(scanner.nextLine());
            System.out.println("Introduce el email del lead: ");
            lead.setEmail(scanner.nextLine());
            System.out.println("Introduce el id de la compañia: ");
            int id = scanner.nextInt();
            lead.setSalesRep(new SalesRep(lead.getName(),companyRepo.findById(id).get()));
            System.out.println("Nuevo representante de ventas insertado correctamente");
            leadRepo.save(lead);
            System.out.println("Lead de venta insertado correctamente");

        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override
    public void showLeads(LeadRepo leadRepo) {
        System.out.println(Arrays.toString(leadRepo.findAll().toArray()));
    }

    @Override
    public Oportunity leadToOportunity(LeadRepo leadRepo, OportunityRepo oportunityRepo, CompanyRepo companyRepo) throws IllegalFormatException {
        System.out.println("Qué numero de lead quieres convertir en opoturnidad? ");
        System.out.println(Arrays.toString(leadRepo.findAll().toArray()));

        long id = scanner.nextLong();
        if (leadRepo.findById(id).isPresent()) {
            oportunity.setDecisionMaker(new Contact());
            oportunity.setStatus(Status.OPEN);
            oportunity.setSalesRep(leadRepo.findById(id).get().getSalesRep());
            oportunityRepo.save(oportunity);
            System.out.println("Nueva oportunidad de venta creada");
            System.out.println("Quiere crear nueva cuenta de empresa?\n" +
                    " t para crear nueva cuenta,\n" +
                    " cualquier otro botón para seguir.");
            String option = scanner.nextLine();
            if (option.equals("t")) {
                newCompany(companyRepo);
            } else {
                System.out.println("Con qué empresa quiere asociar esta oportunidad? Escoja id");
                System.out.println(Arrays.toString(companyRepo.findAll().toArray()));
                int id2 = scanner.nextInt();

            }

        }
        else{
                System.out.println("Lead no encontrado");
                return null;
            }

            return oportunity;
        }

    @Override
    public void showSalesRep(SalesRepRepo salesRepRepo) {
        System.out.println(Arrays.toString(salesRepRepo.findAll().toArray()));
    }

    @Override
    public void newCompany(CompanyRepo companyRepo) {
            System.out.println("Introduzca nombre de ciudad: ");
            String ciudad = scanner.nextLine();
            company.setCity(ciudad);
            System.out.println("Escoja la industria: ") ;
            try{
                Industry industria = Industry.valueOf(scanner.nextLine());
                company.setIndustry(industria);
            } catch (IllegalFormatException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Escriba número de empleados: ") ;
            int num = scanner.nextInt();
            company.setNumberEmployees(num);

        }

}