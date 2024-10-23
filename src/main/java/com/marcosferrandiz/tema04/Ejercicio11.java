package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    /**
     * Crea un número aleatorio entre los seleccionados anteriormente
     * @param golesMin La cantidad de goles minimos (El numero minimo de el Random)
     * @param golesMax La cantidad de goles maximos (El numero maximos de el Random)
     * @return Devuelve el número del random
     */
    public static int golesAleatorios(int golesMin, int golesMax){
        Random rng = new Random();
        int goles = rng.nextInt(golesMin,golesMax);
        return goles;
    }

    /**
     * Muestra el resultado del partido como 1, X o 2 dependiendo de quien haya ganado
     * @param golesMin La cantidad de goles minimos (El numero minimo de el Random)
     * @param golesMax La cantidad de goles maximos (El numero maximos de el Random)
     */
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
