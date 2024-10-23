package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Imprime el caracter indicado x veces hacia la derecha
     * @param letra
     * @param numVeces
     */
    public static void imprimirCaracterXVeces(char letra, int numVeces){
        for (int i = 0; numVeces > i; i++){
            System.out.print(letra);
        }

    }
/*
   BIEN
    public static String imprimirCaracterXVecesConString(char letra, int numVeces){

        if (numVeces <= 0){
            return null;
        }
        String resultado = "";
        for (int i = 0; numVeces > i; i++){
            resultado += letra;
        }
        return resultado;
        }
         */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la letra que quiera");
        char caracter = input.nextLine().charAt(0);
        System.out.println("Indique el numero de veces que quieras repetirlo");
        int numeroVeces = Integer.parseInt(input.nextLine());

        input.close();

        imprimirCaracterXVeces(caracter, numeroVeces);

        /*
        BIEN
        String texto = imprimirCaracterXVecesConString( 'B',5);
       if (texto == null){
           System.err.println("Debes indicar un número positivo");
       } else {
           System.out.println(texto);
       }
        */

    }
}
