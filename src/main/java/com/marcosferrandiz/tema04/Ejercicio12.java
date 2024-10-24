package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.rng;

import java.util.Random;

public class Ejercicio12 {

    /**
     * Crea un numero aleatorio, lo repite X veces y el resultado lo guarda en un string
     * @param notas Es el valor introducido
     * @return Devuelve un string con el resultado
     */
    public static String genNota(int notas){
        Random rng = new Random();
        String finalRes = "";
        Calificaciones resultado;
        for (int i = 0; i <= 50;i++){
            int calificacion = rng.nextInt(0,11);
            resultado = calificacionAlfabetica(calificacion);
            finalRes += resultado + "\n";
        }
        return finalRes;
    }

    /**
     * Saca un enumerado de nota dependiendo de la nota introducida
     * @param nota Es la nota introducida
     * @return Devuelve el resultado del enumerado
     */
    public static Calificaciones calificacionAlfabetica(int nota){
        Calificaciones notas;
        if (nota < 5){
            notas = Calificaciones.INSUFICIENTE;
        }else if (nota < 6){
            notas = Calificaciones.SUFICIENTE;
        }else if (nota < 7){
            notas = Calificaciones.BIEN;
        }else if (nota < 9){
            notas = Calificaciones.NOTABLE;
        }else{
            notas = Calificaciones.EXCELENTE;
        }
        return notas;
    }

    public enum Calificaciones{
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE
    }


    public static void main(String[] args) {
        String resultadoNotas = genNota(50);
        System.out.println(resultadoNotas);


    }
}
