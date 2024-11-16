package com.marcosferrandiz.tema04.Recursividad;

import com.marcosferrandiz.tema04.libreria.IO;

public class Ejercicio1 {
    /**
     * Hace una cuenta regresiva des de el numero indicado hasta 1, mostrando todos los numeros
     * @param num Es el numero indiado por el usuario
     */
    public static void cuentaRegresiva(int num) {
        if (num == 0) {
            return;
        }
        System.out.print(num);
        if (num > 1) {
            System.out.print(", ");
        }
        cuentaRegresiva(num - 1);
    }

    public static void main(String[] args) {
        int num = IO.solicitarEntero("Esriba el número desde el que quieres empezar (1-100)",1,100);
        System.out.println("Cuenta regresiva desde " + num + ":");
        cuentaRegresiva(num);
    }
}
