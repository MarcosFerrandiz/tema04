package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejecicio6 {
    /**
     * Imprime la letra indicada x veces hacia la derecha y x veces hacia abajo
     * @param letra Es la letra que insertará el usuario
     * @param largo Es el largo de las veces que se repetirá el código
     * @param alto Es el alto de las veces que se repetirá el largo pero para abajo
     */
    public static void imprimirCaracterXVeces(char letra, int largo, int alto){
        for (int i = 0; largo > i; i++){
            for (int a = 1; alto > a; a++){
                System.out.print(letra);
            }
            System.out.println(letra);
        }
    }

    /*
    BIEN
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
     */




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique la letra que quiera");
        char caracter = input.nextLine().charAt(0);
        System.out.println("Indique el alto que quieras que se repita la letra");
        int alto = Integer.parseInt(input.nextLine());
        System.out.println("Indique el largo que quieras que se repita la letra");
        int largo = Integer.parseInt(input.nextLine());

        input.close();

        imprimirCaracterXVeces(caracter, alto, largo);



        /*
        BIEN
         String texto = repetir( 'B',5,4);
       if (texto == null){
           System.err.println("Debes indicar un número positivo");
       } else {
           System.out.println(texto);
       }
         */
    }
}
