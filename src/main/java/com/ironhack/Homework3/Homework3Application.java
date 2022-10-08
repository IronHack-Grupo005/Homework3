package com.ironhack.Homework3;

import com.ironhack.Homework3.models.Company;
import com.ironhack.Homework3.models.SalesRep;
import com.ironhack.Homework3.pages.CRMWelcomeScreen;
import com.ironhack.Homework3.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Homework3Application implements CommandLineRunner {

	@Autowired
	CompanyRepo companyRepo;
	@Autowired
	SalesRepRepo salesRepRepo;
	@Autowired
	LeadRepo leadRepo;
	@Autowired
	OportunityRepo oportunityRepo;
	@Autowired
	ContactRepo contactRepo;

	public Homework3Application() {}

	public static void main(String[] args) {
		SpringApplication.run(Homework3Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		CRMWelcomeScreen.menuPrincipal(salesRepRepo, companyRepo, contactRepo,leadRepo,oportunityRepo);
	}
}
