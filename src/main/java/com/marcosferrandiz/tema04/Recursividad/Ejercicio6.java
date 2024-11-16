package com.marcosferrandiz.tema04.Recursividad;

import java.util.Scanner;

public class Ejercicio6 {
    /**
     * Calcula el factorial de un numero introducido por el usuario, pero ahora en version recursivo
     * @param num Es el numero introducido por el usuario
     * @return Devuelve el valor factorial del numero
     */
    public static int factorial(int num){
        if (num == 0){
            return 1;
        }else{
            return num * factorial(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el numero que quiera");
        int num = Integer.parseInt(input.nextLine());
        System.out.println(factorial(num));
        input.close();
    }
}
