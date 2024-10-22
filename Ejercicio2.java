package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio2 {
    public class Mates{
        public static double area (double radio){
            return Math.PI * radio * radio;
        }
        public static double longitud (double radio){
            return (radio*2)* Math.PI;
        }
    }

    public static void main(String[] args) {
        double radio;
        double areaTotal;
        double longitudTotal;
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el radio para calcular el area y la longitud");
        radio = Double.parseDouble(input.nextLine());
        areaTotal = Mates.area(radio);
        longitudTotal = Mates.longitud(radio);
        System.out.printf("El area total del circulo es %.2f cm2 por ejemplo, y la longitud es de %.2f cm por ejemplo también", areaTotal, longitudTotal);

    }
}
