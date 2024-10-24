package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio14 {
    /**
     * Calcula el combinatorio de los numeros introducidos
     * @param n El primer número que introducimos
     * @param m El segundo numero que introducimos
     * @return Devuelve el resultado del calculo combinatorio
     */
    public static float combinatorio(int n, int m){
        int resResta = n-m;
        long factN = Ejercicio7.fact(n);
        long factM = Ejercicio7.fact(m);
        long factResta = Ejercicio7.fact(resResta);
        float resultado = factN/(factM*factResta);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca N");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Introduzca M");
        int m = Integer.parseInt(input.nextLine());
        input.close();

        System.out.println("El resultado del combinatorio es " +combinatorio(n,m));
    }
}
