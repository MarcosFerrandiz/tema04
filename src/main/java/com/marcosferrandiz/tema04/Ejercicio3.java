package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Lo que hace es devolver el valor mas grande entre dos numeros
     * @param num1 El primer valor introducido
     * @param num2 El segundo valor introducido
     * @return Devolverá el valor más grande
     */
    public static Integer sacarNumMayor(int num1, int num2){
        return num1 >= num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el primer número");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Indique el segudno número");
        int num2 = Integer.parseInt(input.nextLine());
        input.close();
        int numeroMayor = sacarNumMayor(num1, num2);
        System.out.printf("El número mayor entre los dos es %d\n", numeroMayor);

    }
}
