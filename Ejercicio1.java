package com.marcosferrandiz.tema03.metodos;


public class Ejercicio1 {
    public static int suma (int num1, int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 4;

        int resultadoSuma = suma(num1,num2);
        System.out.println(resultadoSuma);
    }
}
