package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Indica tu edad en dias
     * @param fechaNacimiento La fecha de nacimiento introducida por el usuario
     * @return Devuelve la cantidad de dias de vida desde que nacio hasta ahora con un long
     */
    public static long calcularEdadDias(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(fechaNacimiento, hoy);
        return dias;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la fecha de nacimiento (dd/mm/yyyy)");
        String fechaStr = input.nextLine();
        input.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);
        System.out.printf("Los dias de vida que tienes es de %d dias", calcularEdadDias(fechaNacimiento));

    }
}
