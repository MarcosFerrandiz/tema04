package com.marcosferrandiz.tema04.Recursividad;

import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Calcula la potencia de un número
     * @param num Es el numero base introducido por el usuario
     * @param pot Es la potencia que se le va a poner al numero base, tambien introducido por el usuario
     * @return Devuelve el resultado final del numero base * la potencia
     */
    public static int potencias(int num, int pot){
        if (pot==0){
            return 1;
        }else {
            if (pot==1){
                return num;
            }else {
                return num * potencias(num,pot-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el numero base");
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Escriba la potencia");
        int pot = Integer.parseInt(input.nextLine());
        System.out.println("El resultado final es: "+ potencias(num,pot));
        input.close();
    }

}
