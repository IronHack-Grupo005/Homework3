package com.ironhack.Homework3;

import com.ironhack.Homework3.classes.CRM;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework3Application implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Homework3Application.class, args);
	}

	CRM crm = new CRM();


	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n");
		System.out.println("#################");
		System.out.println("Escoje opción:");
		System.out.println("1. Crear Lead:");
		System.out.println("2. Mostrar Leads");
		System.out.println("3. Convertir Lead");
		System.out.println("4. Cancelar Oportunidad:");
		System.out.println("5. Salir:");
		System.out.println("O escribe un comando:");

		CRM crm = new CRM();
		crm.run();
	}
}
