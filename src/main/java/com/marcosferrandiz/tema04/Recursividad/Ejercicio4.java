package com.marcosferrandiz.tema04.Recursividad;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Te suma el valor de los digitos del numero
     * @param num Es el número introducido por el usuario
     * @return Devuelve el resultado de la suma de cada digito
     */
    public static int sumaNum(int num) {
        if (num < 10) {
            return num;
        }
        return (num % 10) + sumaNum(num / 10);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el numero que quiera");
        int num = Integer.parseInt(input.nextLine());
        int suma = sumaNum(num);
        System.out.println("La suma de los dígitos de " + num + " es: " + suma);
        input.close();
    }
    
}
