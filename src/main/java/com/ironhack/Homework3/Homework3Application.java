package com.ironhack.Homework3;

import com.ironhack.Homework3.service.CRMWelcomeScreen;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Homework3Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Homework3Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		CRMWelcomeScreen.menuPrincipal();
	}
}
