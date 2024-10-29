package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Calcula la edad de una persona a traves de su fecha completa de nacimiento
     * @param fechaNacimiento La fecha de nacimiento del usuario indicada en el main
     * @return Devuelve los años
     */
    public static int calcularEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        Period period = Period.between(fechaNacimiento, hoy);
        return period.getYears();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la fecha de nacimiento (dd/mm/yyyy)");
        String fechaStr = input.nextLine();
        input.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Tienes %d años \n", calcularEdad(fechaNacimiento));

    }
}
