package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Enumeration;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Planeta{
        MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    /**
     * Calcula tu fecha de nacimiento y la pasa a dias
     * @param fechaNacimiento Fecha de nacimiento
     * @return Devuelve la cantidad de dias en los que llevas vivo
     */
    public static long calcularEdadAlienigena(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento, hoy);
    }

    /**
     * Saca la cantidad de dias que tarda en dar la vuelta al sol el planeta elegido
     * @param planeta Es el planeta que hemos elegido sacado del enum
     * @return Devuelve la cantidad de dias del planeta
     */
    public static double dias(Planeta planeta){
        double diasVueltaAlSol;
        diasVueltaAlSol = switch (planeta){
            case MERCURIO -> 87.9;
            case VENUS -> 224.7;
            case TIERRA -> 365.25;
            case MARTE -> 687;
            case JUPITER -> 4333;
            case SATURNO -> 10759;
            case URANO -> 30668;
            case NEPTUNO -> 60182;
        };
        return diasVueltaAlSol;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la fecha de nacimiento (dd/mm/yyyy)");
        String fechaStr = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);

        System.out.println("Introduce el planeta (No esta disponible planeta Vegetta)");
        for (int i = 0; i< Planeta.values().length; i++){
            System.out.println((i+1) + ". "+ Planeta.values()[i].toString() );
        }
        int numPlaneta = Integer.parseInt(input.nextLine());
        Planeta planeta = Planeta.values()[numPlaneta -1];
        double year = calcularEdadAlienigena(fechaNacimiento)/dias(planeta);
        System.out.printf("Tu edad en el planeta es de %.2f años "+ planeta, year);

        input.close();
    }

}
