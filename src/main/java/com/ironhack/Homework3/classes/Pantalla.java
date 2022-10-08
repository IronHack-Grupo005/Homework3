package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.repositories.LeadRepository;

import java.util.List;
import java.util.Scanner;

public class Pantalla {

    public static int menuPrincipal (CRM crm) throws NumberFormatException{

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Escoje opción:");
        System.out.println("1. Crear Lead:");
        System.out.println("2. Mostrar Leads");
        System.out.println("3. Convertir Lead");
        System.out.println("4. Cancelar Oportunidad:");
        System.out.println("5. Salir:");
        System.out.println("O escribe un comando:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        switch(tecla){
            case "1": return 1;
            case "2": return 2;
            case "3": return 3;
            case "4": return 4;
            case "5": return 5;
        }

        if (tecla.toLowerCase().contains("show leads")) {
            return 21;
        } else if (tecla.toLowerCase().contains("lookup lead")) {
            return 22;
        } else if (tecla.toLowerCase().contains("convert")) {
            return 23;
        }

        return 0;
    }

    public static String menuPideA_Convertir(List<Leads> leads){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        for(Leads l : leads){
            System.out.println(l.getName());
        }
        System.out.println("Escoje uno:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        return tecla;
    }
    public static String menuPideA_Cancelar(List<Opportunity> oppr){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        for(Opportunity o : oppr) {
            System.out.println(o.getId() + ". " + o.getName());
        }

        System.out.println("Escoje uno:");

        String tecla = key.nextLine();

        System.out.println("Has escrito: " + tecla);

        return tecla;
    }

    public static void menuMuestra_Convertir(Leads lead){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        System.out.println("Vamos a convertir a:");

        System.out.println(lead.getId() + ". " +  lead.getName());

    }

    public static void menuMuestra_Cancelar(Opportunity oppr){
        Scanner key = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("#################");
        System.out.println("Vamos a cancelar a:");

        System.out.println(oppr.getId() + ". " +  oppr.getName());

    }
    public static Leads menuNewLead(){

        Scanner key = new Scanner(System.in);
        LeadRepository leadRepository;

        System.out.println("\n\n\n");
        System.out.println("############");
        System.out.println("# NEW LEAD #");
        System.out.println("############");
        System.out.println("Escribe Nombre:");
        String name = key.nextLine();
        System.out.println("Escribe Telefono:");
        String phoneNumber = key.nextLine();
        System.out.println("Escribe email:");
        String email = key.nextLine();
        System.out.println("Escribe Empresa:");
        String companyName = key.nextLine();

        Leads lead = new Leads(name, phoneNumber, email, companyName);

        // TODO: Esto no va
        //leadRepository.save();

        Pantalla.menuLeadCreado(lead);

        return lead;
    }
    public static int menuListaLeads(List<Leads> leads){
        System.out.println("\n");
        System.out.println("#################");
        System.out.println("# Listado Leads #");
        System.out.println("#################");
        for(Leads l : leads){
            System.out.println(l.getId() + ". " +  l.getName());
        }
        return 0;
    }
    /*
    public static int menuListaOppors(List<Opportunity> oppors){
        System.out.println("\n");
        System.out.println("#########################");
        System.out.println("# Listado Oportunidades #");
        System.out.println("#########################");
        for(Lead o : oppors){
            System.out.println(o.getIdentificador() + ". " +  o.getName());
        }
        return 0;
    }
    public static int menuListaOppor(List<Opportunity> oppor){

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("# Listado Leads #");
        System.out.println("#################");

        for(Lead p : oppor){
            System.out.println(p.getIdentificador() + ". " +  p.getName());
        }

        System.out.println("#################");
        System.out.println("Escoje uno: ");
        String tecla = key.nextLine();



        return 0;
    }
    */
    public static int menuCancelLead(){

        Scanner key = new Scanner(System.in);

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("CANCEL LEAD");
        System.out.println("#################");
        System.out.println("Perdido o Ganado (1,2):");

        String tecla = key.nextLine();
        return 41;
    }
    public static void menuLeadCreado(Leads lead){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Se ha creado el Lead");
        System.out.println("#################");
        System.out.println(lead.getId() + ". " +  lead.getName());
    }
    public static void menuMuestraLead(Leads lead){
        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde la busueda es:");
        System.out.println(lead.getId() + ". " +  lead.getName());
    }
    public static Leads menuMuestraLeadAconvertir(Leads lead){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde convertir es:");
        System.out.println(lead.getId() + ". " +  lead.getName());

        return lead;
    }
    public static Opportunity menuMuestraOpprAcancelar(Opportunity oppr){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("El Lead mostrado desde convertir es:");
        System.out.println(oppr.getId() + ". " +  oppr.getName());

        return oppr;
    }
    public static void menuAdios(){

        System.out.println("\n\n");
        System.out.println("#################");
        System.out.println("Adios");
        System.out.println("#################");
    }

}
