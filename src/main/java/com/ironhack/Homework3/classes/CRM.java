package com.ironhack.Homework3.classes;

import com.ironhack.Homework3.enums.Status;
import com.ironhack.Homework3.repositories.LeadRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CRM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "crmLead")
    List<Leads> leads;

    @OneToMany(mappedBy = "crmOppor")
    List<Opportunity> oppors;

    private static int countLeads = 0;

    public boolean run() {

        LeadRepository leadRepository;

        int accion = 0;
        while (accion != 5) {

            /* Las que o necesitan de menu */
            if (accion != 21 || accion != 22 || accion != 23 || accion != 41) {
                accion = Pantalla.menuPrincipal(this);
            }

            switch (accion) {
                case 1:
                    // TODO: Como se guarda ?
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

                    Leads lead = Pantalla.menuMuestraLeadAconvertir(this.getLead(returnLast(tecla23) - 1));
                    Pantalla.menuMuestra_Convertir(lead);
                    Opportunity oppor = (Opportunity) lead.clone();
                    oppor.setStatus(Status.OPEN);

                    //TODO: Esto es asi ?
                    this.oppors.add(oppor);

                    accion = 0;
                    break;
                case 4:
                    accion = Pantalla.menuCancelLead();
                    break;

                case 41:
                    /* Devolvemos string de lo escrito */

                    String tecla1 = Pantalla.menuPideA_Cancelar(this.oppors);
                    /* Cogemos la ultima parte u lo guardamos en objeto */
                    Opportunity oppr = Pantalla.menuMuestraOpprAcancelar(this.getOppr(returnLast(tecla1) - 1));
                    /* Mostraos a quien vamos a cancelar */
                    Pantalla.menuMuestra_Cancelar(oppr);
                    /* Temporal que despues añadimos */
                    Opportunity opporTemp = (Opportunity) oppr.clone();
                    opporTemp.setStatus(Status.CLOSED_LOST);

                    // TODO: Deberia ser remove
                    this.oppors.add(opporTemp);
                    accion = 0 ;

                    break;
            }
        }
        Pantalla.menuAdios();
        return true;
    }

    public Leads getLead (int id){
        return this.leads.get(id);
    }

    public Opportunity getOppr (int id){
        return this.oppors.get(id);
    }
    public static int returnLast(String s){
        String search = s.substring(s.lastIndexOf(" ") + 1);
        int number = 0;
        number = Integer.parseInt(search);
        return number;
    }

}
