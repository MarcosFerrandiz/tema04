package com.marcosferrandiz.tema04.Recursividad;

import com.marcosferrandiz.tema04.libreria.IO;

public class Ejercicio2 {
    /**
     * Hace una suma recursiva de todos los numeros desde el 1 hasta el numero indicado por el usuario
     * @param num Es el numero indicado por el usuario
     * @return Devuelve la suma de todos los numeros
     */
    public static int sumaRecursiva(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumaRecursiva(num - 1);
    }

    public static void main(String[] args) {
        int num = IO.solicitarEntero("Esriba el número que quiera (1-100)",1,100);
        int resultado = sumaRecursiva(num);
        System.out.println("La suma de los números del 1 al " + num + " es: " + resultado);
    }
}
