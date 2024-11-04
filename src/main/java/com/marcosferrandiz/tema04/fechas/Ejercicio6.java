package com.marcosferrandiz.tema04.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    /**
     * Va sumando un valor a + un valor b, y luego devuelve a
     * @param a Primer valor introducido
     * @param b Segundo valor introducido
     * @return Devuelve la suma de ambos
     */
    public static int cuenta(int a,int b){
        a = a + b;
        return a;
    }
    public static void main(String[] args) {

        Timer timer = new Timer();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM HH:mm:ss");
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println(ahora);

        int diaHoy = ahora.getDayOfMonth();
        int mesHoy = ahora.getMonthValue();
        int horaHoy = ahora.getHour();
        int minHoy = ahora.getMinute();
        int secHoy = ahora.getSecond();

        LocalDateTime anoNuevo = LocalDateTime.parse("01/01/2025 00:00:00", dateTimeFormatter);

        int diaNewYear = anoNuevo.getDayOfMonth();
        int mesNewYear = anoNuevo.getMonthValue();
        int horaNewYear = anoNuevo.getHour();
        int minNewYear = anoNuevo.getMinute();
        int secNewYear = anoNuevo.getSecond();

        int dia = diaHoy - diaNewYear;
        int mes = mesHoy - mesNewYear;
        int hora = horaHoy - horaNewYear;
        int min = minHoy - minNewYear;
        int sec = secHoy - secNewYear;

        LocalDateTime s = ChronoUnit.SECONDS.addTo(anoNuevo, -sec -1);
        LocalDateTime m = ChronoUnit.MINUTES.addTo(s, -min -1);
        LocalDateTime h = ChronoUnit.HOURS.addTo(m, -hora -1);
        LocalDateTime d = ChronoUnit.DAYS.addTo(h, -dia -1);
        LocalDateTime me = ChronoUnit.MONTHS.addTo(d, -mes -1);

        final int a = 1;

        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 1;
            @Override
            public void run() {
                i = cuenta(a,i);
                LocalDateTime queda = ChronoUnit.SECONDS.addTo(me, -i);
                String fechaFormateada = queda.format(dateTimeFormatter2);
                System.out.println(fechaFormateada);
            }
        }, 0, 1000);

    }
}
