package com.ironhack.Homework3;

import com.ironhack.Homework3.classes.Leads;
import com.ironhack.Homework3.repositories.LeadRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class TestMiguel {

    Leads lead;

    @Autowired
    LeadRepository leadRepository;

    @BeforeEach
    void set_up(){
        lead = new Leads();
    }

    @AfterEach
    void tearDown() {

        //leadRepository.deleteAll();
    }

    @Test
    void if_preset() {
        Leads lead = leadRepository.save(new Leads( "Miguel", "677", "@email", "fds"));
        Assertions.assertEquals("Miguel",lead.getName() );
    }

    @Test
    void check_find_by(){
        Leads lead = leadRepository.save(new Leads( "Pepe", "252", "@email", "Amazon"));
        Optional<Leads> leadsOptional = leadRepository.findByName("Miguel");
        Assertions.assertTrue(leadsOptional.isPresent());
    }

    /*
    @Test
    @DisplayName("Probamos busqueda por nombre")
    void testFind_OK(){
        assertEquals("Miguel", personas.findByName("Miguel").getName());
    }

    @Test
    @DisplayName("Edad inferior a Zero")
    void testAdd_KO (){
        System.out.println(
                assertThrows(RuntimeException.class, () -> {
                    personas.añade("Miguelito", -10, "Desconocido");
                    System.out.println( "La excpcion es: ");
                })
                        .getMessage()
        )
        ;
    }
*/
}