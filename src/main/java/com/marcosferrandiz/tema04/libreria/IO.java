package com.marcosferrandiz.tema04.libreria;

import java.util.Scanner;

public class IO {
    /**
     * Solicita un texto y valida que su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrará al usuario
     * @param longitudMinima Número minimo de caracteres que debe tener el texto
     * @param longitudMaxima Número maximo de caracteres que debe tener un texto
     * @return El texto leido valido
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        Scanner input = new Scanner(System.in);
        boolean valido;
        String resultado;
        do {
            System.out.println(mensaje);
            resultado = input.nextLine();
            valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima;
            if (!valido) {
                System.err.printf("La longitud no es correcta, deberá de estar entre %d - %d\n",longitudMinima,longitudMaxima);
            }
        }while (!valido);
        input.close();
        return resultado;
    }

    public static Integer solicitarEntero(String mensaje, int numMin, int numMax){
        Scanner input = new Scanner(System.in);
        boolean valido;
        int num;

        do {
            System.out.println(mensaje);
            num = Integer.parseInt(input.nextLine());
            valido = num >= numMin && num <= numMax;

            if (!valido){
                System.err.printf("El numero no es válido, debe de estar entre el %d - %d\n", numMin, numMax);
            }

        }while (!valido);
        input.close();
        return num;


    }
}
