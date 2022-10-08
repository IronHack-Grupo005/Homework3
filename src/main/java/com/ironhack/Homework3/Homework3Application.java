package com.ironhack.Homework3;

import com.ironhack.Homework3.classes.CRM;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework3Application
		implements CommandLineRunner
{

	public static void main(String[] args) {

		SpringApplication.run(Homework3Application.class, args);
	}

	CRM crm = new CRM();


	@Override
	public void run(String... args) throws Exception {

		CRM crm = new CRM();
		crm.run();
	}


}
