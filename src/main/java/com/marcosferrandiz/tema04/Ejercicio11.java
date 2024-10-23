package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static int golesAleatorios(int golesMin, int golesMax){
        Random rng = new Random();
        int goles = rng.nextInt(golesMin,golesMax);
        return goles;
    }

    public static void quinela(int golesMin, int golesMax){
        int partido = 1;
        do {
            String resultado = "";
            int betis = golesAleatorios(golesMin,golesMax);
            int cadiz = golesAleatorios(golesMin,golesMax);
            if (betis == cadiz){
                resultado = resultado + "X";
            }else {
                if (betis>cadiz){
                    resultado = resultado + "1";
                }else {
                    resultado = resultado + "2";
                }
            }
            System.out.printf("Partido %d      %s\n", partido, resultado);
            partido+=1;
        }while (partido <=15);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el minimo de goles");
        int minGoles = Integer.parseInt(input.nextLine());
        System.out.println("Indique el maximo de goles");
        int maxGoles = Integer.parseInt(input.nextLine());

        quinela(minGoles, maxGoles);


    }
}
