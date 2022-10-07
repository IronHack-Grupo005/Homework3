package com.ironhack.Homework3.classes;

import javax.persistence.*;
import java.util.List;

@Entity
public class CRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "crm")
    List<Leads> leads;
    @OneToMany(mappedBy = "crm")
    List<Opportunity> oppors;

    private static int countLeads = 0;

    public boolean run() {

        int accion = 0;
        while (accion != 5) {

            /* Las que o necesitan de menu */
            if (accion != 21 || accion != 22 || accion != 23 || accion != 41) {
                accion = Pantalla.menuPrincipal(this);
            }
            //System.out.println("Accion: " + accion);

            switch (accion) {
                case 1:
                    leads.add(Pantalla.menuNewLead());
                    this.countLeads += 1;
                    accion = 0;
                    break;
                case 2:
                    accion = Pantalla.menuListaLeads(this.leads);
                    break;
                case 21:
                    accion = Pantalla.menuListaLeads(this.leads);
                    break;
                case 22:
                    String tecla22 = Pantalla.menuPideA_Convertir(this.leads);
                    //Pantalla.menuMuestraLead(this.getLead(returnLast(tecla22) - 1));
                    accion = 0;
                    break;
                case 23:
                    String tecla23 = Pantalla.menuPideA_Convertir(this.leads);
                    /*
                    Lead lead = Pantalla.menuMuestraLeadAconvertir(this.getLead(returnLast(tecla23) - 1));
                    Pantalla.menuMuestra_Convertir(lead);
                    Opportunity oppor = (Opportunity) lead.clone();
                    oppor.setStatus(Status.OPEN);
                    opors.add(oppor);
                    */

                    accion = 0;
                    break;
                case 4:
                    accion = Pantalla.menuCancelLead();
                    break;

                case 41:
                    /* Devolvemos string de lo escrito */
                    /*
                    String tecla1 = Pantalla.menuPideA_Cancelar(this.opors);
                    /* Cogemos la ultima parte u lo guardamos en objeto
                    Opportunity oppr = Pantalla.menuMuestraOpprAcancelar(this.getOppr(returnLast(tecla1) - 1));
                    /* Mostraos a quien vamos a cancelar
                    Pantalla.menuMuestra_Cancelar(oppr);
                    /* Temporal que despues añadimos
                    Opportunity opporTemp = (Opportunity) oppr.clone();
                    opporTemp.setStatus(Status.CLOSED_LOST);
                    opors.add(opporTemp);
                    accion = 0 ;
                    */
                    break;
            }
        }
        Pantalla.menuAdios();
        return true;
    }
    public CRM() {
    }

    public CRM(Long id, List<Leads> leads, List<Opportunity> oppors) {
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

    public List<Leads> getLeads() {
        return leads;
    }

    public void setLeads(List<Leads> leads) {
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
