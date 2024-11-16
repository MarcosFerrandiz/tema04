package com.marcosferrandiz.tema04.Recursividad;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Coje el número indicado por el usuario y cuenta la cantidad de digitos que hay en ese número
     * @param num Es el numero indicado por el usuario
     * @return Devuelve la cantidad de digitos que hay en el numero
     */
    public static int contarDigitos(float num) {
        if (num < 10) {
            return 1;
        }
        return 1 + contarDigitos(num / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el número deseado");
        float num = Float.parseFloat(input.nextLine());
        int cantDigi = contarDigitos(num);
        System.out.println("El número "+ num + " tiene "+ cantDigi+" digitos");
        input.close();
    }
}
