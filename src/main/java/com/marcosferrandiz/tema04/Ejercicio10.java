package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio10 {

    /**
     * Crea y muestra la tabla de multiplicar hasta el 10 del número insertado por el usuario
     * @param num Es el número insertado por el usuario el cual quiere saber su tabla de multiplicar
     */
    public static void tablaMulti(int num){
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.printf("%d * %d = %d\n",num,i,resultado);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        while (numero>=0){
            System.out.println("Indique el número que quieras saber su tabla de multiplicar");
            numero = Integer.parseInt(input.nextLine());
            if (numero < 0){
                System.err.println("El número introducido no puede ser menor a 0");
                break;
            }
            tablaMulti(numero);

        }

    }
}
