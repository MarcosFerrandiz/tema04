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
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la letra que quiera");
        char caracter = input.nextLine().charAt(0);
        System.out.println("Indique el numero de veces que quieras repetirlo");
        int numeroVeces = Integer.parseInt(input.nextLine());

        input.close();

        imprimirCaracterXVeces(caracter, numeroVeces);
    }
}
