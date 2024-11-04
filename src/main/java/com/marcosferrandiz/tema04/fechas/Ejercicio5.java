package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la fecha del lanzamiento en formato dd/MM/yyyy");
        String fechaSalida = scanner.nextLine();
        System.out.println("Introduce la hora del lanzamiento en formato HH:mm:ss");
        String horaSalida = scanner.nextLine();
        System.out.println("Introduzca la velocidad que tiene el cohete en km/h");
        float vel = Float.parseFloat(scanner.nextLine());
        scanner.close();

        String fechaHora = fechaSalida + " " + horaSalida;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaTiempo = LocalDateTime.parse(fechaHora, formatter);
        final long DISTANCIA = 225000000;
        double horas = DISTANCIA / vel;
        double dias = horas / 24;

        int diasEnteros = (int) dias;
        Period periodoDias = Period.ofDays(diasEnteros);
        dias = dias - diasEnteros;
        double segundosViaje = dias * 86400;
        LocalDateTime fechaLlegada = fechaTiempo.plus(periodoDias);
        LocalDateTime fechaHoraLlegada = ChronoUnit.SECONDS.addTo(fechaLlegada, (int)segundosViaje);
        System.out.println(fechaHoraLlegada);
    }

}