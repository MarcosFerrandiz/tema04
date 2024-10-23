package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Scanner;

public class Ejercicio8 {

    public static boolean esCapicua4Numeros(int n1, int n2, int n3, int n4){
        boolean valido = n1 == n4 && n2 == n3;
        return valido;
    }


    public static void main(String[] args) {

        int numero = IO.solicitarEntero("Indique un número de 4 cífras que sea capicua",1000,9999);
        String numString = "" + numero;
        int n1 = numString.charAt(0);
        int n2 = numString.charAt(1);
        int n3 = numString.charAt(2);
        int n4 = numString.charAt(3);

        String resultado = esCapicua4Numeros(n1,n2,n3,n4) ? "Es capicua" : "No es capicua";
        System.out.printf("El valor %d "+resultado+"\n",numero,resultado);

    }
}
