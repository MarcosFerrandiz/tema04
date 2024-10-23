package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio4 {
    /**
     * Nos indicará que numero es el mayor de los cuatro
     * @param num1 El primer número introducido
     * @param num2 El segundo número introducido
     * @param num3 El tercer número introducido
     * @param num4 El cuarto número introducido
     * @return Nos devolverá el número mayor de los cuatro
     */
    public static int mayorCuatro(int num1, int num2, int num3, int num4){
        int numMax1, numMax2, numMayor;
        numMax1 = num1 >= num2 ? num1 : num2;
        numMax2 = num3 >= num4 ? num3 : num4;
        numMayor = numMax1 >= numMax2 ? numMax1 : numMax2;
        return numMayor;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el primer número");
        int num1 = Integer.parseInt(input.nextLine());
        System.out.println("Indique el segundo número");
        int num2 = Integer.parseInt(input.nextLine());
        System.out.println("Indique el tercer número");
        int num3 = Integer.parseInt(input.nextLine());
        System.out.println("Indique el cuarto número");
        int num4 = Integer.parseInt(input.nextLine());
        int numMayor = mayorCuatro(num1,num2,num3,num4);
        System.out.printf("El número mayor entre %d , %d , %d , y %d es el %d\n", num1, num2, num3, num4, numMayor);

    }
}
