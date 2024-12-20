package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Hace el factorial de un numero
     * @param entero Es el número indicado por el usuario
     * @return Devuelve el resultado del factorial
     */
    public static long fact(int entero){
        long resultFinal = 1;
        for (int i = entero; i >0; i--){
            resultFinal = i * resultFinal;
        }
        return resultFinal;
    }

    public static void main(String[] args) {
        int numero = IO.solicitarEntero("Indique el número que quiera", 0,100);
        long resultado = fact(numero);
        System.out.println(resultado);

    }
}
