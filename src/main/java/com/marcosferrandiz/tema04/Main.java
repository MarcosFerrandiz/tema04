package com.marcosferrandiz.tema04;

import com.marcosferrandiz.tema04.libreria.IO;

import java.util.Scanner;

public class Main {

    /*public static int mayor(int a, int b, int c, int d){
        int mayor1 = Ejercicio3.sacarNumMayor(a,b);
        int mayor2 = Ejercicio3.sacarNumMayor(c, d);
        return Ejercicio3.sacarNumMayor(mayor1, mayor2);
    }*/
/*
    public static String imprimirCaracterXVecesConString(char letra, int numVeces){

        if (numVeces <= 0){
            return null;
        }
        String resultado = "";
        for (int i = 0; numVeces > i; i++){
            resultado += letra;
        }
        return resultado;
         */

    public static String repetir(char letra, int numVeces){

        if (numVeces <= 0){
            return null;
        }
        String resultado = "";
        for (int i = 0; numVeces > i; i++){
            resultado += letra;
        }
        return resultado;
    }

    public static String repetir(char caracter, int fila, int columna){
        String resultado = "";
        for (int i = 1; i <= fila; i++){
            resultado += repetir(caracter,columna) + "\n";
        }
        return resultado;



    }
    public static void main(String[] args) {





       String texto = repetir( 'B',5,4);
       if (texto == null){
           System.err.println("Debes indicar un número positivo");
       } else {
           System.out.println(texto);
       }



        //String nombre = IO.solicitarString("Escriba su nombre", 2, 30);
        //Integer edad = IO.solicitarEntero("Escriba su edad", 0, 100);




    }
}