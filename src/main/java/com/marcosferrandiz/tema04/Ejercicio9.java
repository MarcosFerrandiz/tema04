package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     * Saca el sumatorio de un número, es decir, suma el número seleccionado mas todos los anteriores
     * @param entero Es el número introducido por el usuario el cual se debe sumar sus anteriores
     * @return Devuelve el resultado del sumatorio del numero seleccionado
     */
    public static long sumatorio(int entero){
        long resultFinal = 0;
        for (int i = entero; i >0; i--){
            resultFinal = i + resultFinal;
        }
        return resultFinal;
    }

    public static void main(String[] args) {
        int numero = IO.solicitarEntero("Indique el número que quiera", 0,100);
        long resultado = sumatorio(numero);
        System.out.println(resultado);
    }
}
