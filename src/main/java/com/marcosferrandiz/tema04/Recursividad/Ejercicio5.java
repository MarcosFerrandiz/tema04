package com.marcosferrandiz.tema04.Recursividad;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Te hace la sucesión de fibonacci del numero insertado por el usuario
     * @param num Es el numero introducido por el usuario
     * @return Devuelve el valor del numero correspondiendo a la posicion de fibonacci
     */
    public static int fibionacci(int num){
        if (num == 1 || num == 0){
            return num;
        }else {
            return fibionacci(num-1)+fibionacci(num-2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el numero que quiera");
        int num = Integer.parseInt(input.nextLine());
        for (int i = 0; i < num; i++){
            System.out.println(fibionacci(i));
        }
        input.close();
    }

}
