package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio4 {

    public enum SignoZodiaco{
        ACUARIO, PISCIS, ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO, OFLUCO, SAGITARIO, CAPRICORNIO
    }

    public static String saberSigno (LocalDate fechaNac){
        MonthDay fechaNacimiento = MonthDay.of(fechaNac.getMonth(), fechaNac.getDayOfMonth());
        String signo;

        if (fechaNacimiento.isAfter(MonthDay.of(1, 20)) && fechaNacimiento.isBefore(MonthDay.of(2, 18))){
            signo = SignoZodiaco.CAPRICORNIO.toString();
        } else if (fechaNacimiento.isAfter(MonthDay.of(2, 17)) && fechaNacimiento.isBefore(MonthDay.of(3, 12))){
            signo = SignoZodiaco.ACUARIO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(3, 11)) && fechaNacimiento.isBefore(MonthDay.of(4, 17))){
            signo = SignoZodiaco.PISCIS.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(4, 16)) && fechaNacimiento.isBefore(MonthDay.of(5, 15))){
            signo = SignoZodiaco.ARIES.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(5, 14)) && fechaNacimiento.isBefore(MonthDay.of(6, 22))){
            signo = SignoZodiaco.TAURO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(6, 21)) && fechaNacimiento.isBefore(MonthDay.of(7, 20))){
            signo = SignoZodiaco.GEMINIS.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(7, 19)) && fechaNacimiento.isBefore(MonthDay.of(8, 11))){
            signo = SignoZodiaco.CANCER.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(8, 10)) && fechaNacimiento.isBefore(MonthDay.of(9, 17))){
            signo = SignoZodiaco.LEO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(9, 18)) && fechaNacimiento.isBefore(MonthDay.of(10, 31))){
            signo = SignoZodiaco.VIRGO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(10, 30)) && fechaNacimiento.isBefore(MonthDay.of(11, 23))){
            signo = SignoZodiaco.LIBRA.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(11, 22)) && fechaNacimiento.isBefore(MonthDay.of(11, 29))){
            signo = SignoZodiaco.ESCORPIO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(11, 28)) && fechaNacimiento.isBefore(MonthDay.of(12, 18))){
            signo = SignoZodiaco.OFLUCO.toString();
        }else if (fechaNacimiento.isAfter(MonthDay.of(12, 17)) && fechaNacimiento.isBefore(MonthDay.of(1, 21))) {
            signo = SignoZodiaco.SAGITARIO.toString();
        }else {
            signo = "Error";
        }
        return signo;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la fecha de nacimiento (dd/mm/yyyy)");
        String fechaStr = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, formatter);


        String caballeroDelZodiaco = saberSigno(fechaNacimiento);
        System.out.printf("Tu signo del zodiaco es %s ", caballeroDelZodiaco);
        input.close();
    }
}
