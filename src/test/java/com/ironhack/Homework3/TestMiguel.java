package com.ironhack.Homework3;

import com.ironhack.Homework3.classes.Leads;
import com.ironhack.Homework3.repositories.LeadRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestMiguel {

    Leads lead;

    @Autowired
    LeadRepository leadRepository;

    @BeforeEach
    void set_up(){
        //lead = new Lead();
    }

    @AfterEach
    void tearDown() {

        //leadRepository.deleteAll();
    }

    @Test
    void if_preset() {
        //Lead lead = leadRepository.save(new Lead(1l, "Miguel", "677", "@email", "fds"));
    }

    //@Test
    //void check_if_exist(){
        //Assertions.assertEquals("Miguel",lead.getName() );
    //}

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