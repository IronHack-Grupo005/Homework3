package com.ironhack.Homework3.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Scanner;

public class CRMWelcomeScreen {

    static Scanner key = new Scanner(System.in);
    static int tecla;

    private static ConfigurableApplicationContext close;

    public static CRMOptions menuPrincipal() throws NumberFormatException{

        do {

            System.out.println("\n\n");
            System.out.println("#################");
            System.out.println("Escoje opción:");
            System.out.println("1. Crear Lead:");
            System.out.println("2. Mostrar Leads");
            System.out.println("3. Convertir Lead en Oportunidad");
            System.out.println("4. Cancelar Oportunidad:");
            System.out.println("0. Salir:");
            System.out.println("Seleccione el número de la opción deseada: ");

            tecla = key.nextInt();

            switch (tecla) {
                case 0:
                    System.out.println("Adios");
                    close.close();
                case 1:
                    return null;
                case 2:
                    return null;
                case 3:
                    return null;
                case 4:
                    return null;
                case 5:
                    return null;
                default:
                    System.out.println("Escoja una opción disponible");
            }

        } while (tecla!=0);

        return null;
}

}
