package com.ironhack.Homework3.pages;

import com.ironhack.Homework3.models.Contact;
import com.ironhack.Homework3.models.Lead;
import com.ironhack.Homework3.models.Oportunity;
import com.ironhack.Homework3.models.SalesRep;
import com.ironhack.Homework3.repositories.*;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

public class CRMWelcomeScreen {

    static Scanner key = new Scanner(System.in);
    static int tecla;

    private static ConfigurableApplicationContext close;
    private static CRMOptions crmOptions = new CRMOptions();


    public static void menuPrincipal(SalesRepRepo salesRepRepo,
                                     CompanyRepo companyRepo,
                                     ContactRepo contactRepo,
                                     LeadRepo leadRepo,
                                     OportunityRepo oportunityRepo
                                     ) throws NumberFormatException{

        do {

            System.out.println("\n\n");
            System.out.println("#################");
            System.out.println("Escoge una opción:");
            System.out.println("1. Crear Lead:");
            System.out.println("2. Mostrar Leads:");
            System.out.println("3. Convertir Lead en Oportunidad:");
            System.out.println("4. Cancelar Oportunidad:");
            System.out.println("5. Nuevo representante de ventas:");
            System.out.println("6. Mostrar representantes de ventas:");
            System.out.println("0. Salir:");
            System.out.println("Seleccione el número de la opción deseada: ");

            tecla = key.nextInt();

            switch (tecla) {
                case 0:
                    System.out.println("Adios");
                    close.close();
                case 1:
                    crmOptions.createLead(leadRepo, companyRepo);
                    break;
                case 2:
                    crmOptions.showLeads(leadRepo);
                    break;
                case 3:
                    crmOptions.leadToOportunity(leadRepo, oportunityRepo, companyRepo);
                    break;
                case 4:
                    break;
                case 5:
                     crmOptions.newSalesRep(companyRepo, salesRepRepo);
                     break;
                case 6:
                    crmOptions.showSalesRep(salesRepRepo);
                    break;
                default:
                    System.out.println("Escoja una opción disponible");
            }

        } while (tecla!=0);

}

}
