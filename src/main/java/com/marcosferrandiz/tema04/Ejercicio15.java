package com.marcosferrandiz.tema04;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

    /**
     * Hace un random del 1 al 7, es decir 6 numeros como si fuera un dado
     * @return Devuelve el resultado del random, es decir, el resultado del dado
     */
    public static int rngDado(){
        Random rng = new Random();
        return rng.nextInt(1,7);
    }

    public static String ronda(){
        int ptsJugador = jugarJugarJugarJugarJugador();
        int ptsMax = 11;
        int porraCrupier = 0;
        int porraJugador = 0;
        if (ptsJugador >ptsMax){
            System.out.println("Te has pasado de puntos, por lo que el crupier gana");
            porraCrupier++;
        } else if (ptsJugador == ptsMax) {
            System.out.println("Tienes los puntos exactos, por lo que ganas 2 porras");
            porraJugador += 2;
        }else {
            int ptsCrupier = jugarCrupier(ptsJugador);
            if (ptsCrupier > ptsMax){
                System.out.println("El crupier se ha pasado del máximo de puntos, por lo que ganas la ronda");
                porraJugador++;
            } else if (ptsCrupier == ptsJugador) {
                System.out.println("El crupier tiene los mismo puntos que tu, por lo que el crupier gana la ronda");
                porraCrupier++;
            } else if (ptsCrupier == ptsMax) {
                System.out.println("El crupier tiene los puntos maximos, por lo que gana 2 porras");
                porraCrupier += 2;
            } else {
                System.out.println("El crupier tiene mas que tu y no se ha pasado por lo que gana la ronda");
                porraCrupier++;
            }
        }
        String resultado = ""+ porraJugador + porraCrupier;
        return resultado;
    }


    public static int jugarCrupier(int ptsJugador){
        int pts = 0;
        int maxPts = 11;
        while (pts < ptsJugador && pts < maxPts){
            int resDados = rngDado();
            pts += resDados;
            System.out.println("El crupier ha sacado un "+ resDados + " por lo que ahora tiene "+pts);
        }
        return pts;
    }


    public static String deciJugador(){
        Scanner input = new Scanner(System.in);
        String deci = "";
        boolean check = true;
        while (check){
            System.out.print("¿Deseas lanzar de nuevo? (s/n): ");
            deci = input.nextLine();
            if (deci.equals("s") || deci.equals("n")){
                break;
            }else {
                System.out.println("Valor equivocado, deberá de ingresar s para si o n para no");
            }
        }
        return deci;
    }


    public static int jugarJugarJugarJugarJugador(){
        int pts = 0;
        String deci;
        do {
            int resDado = rngDado();
            pts += resDado;
            System.out.println("Has sacado un " + resDado+"por lo que actualmente tienes "+ pts );
            if (pts >= 11){
                break;
            }
            deci = deciJugador();
        }while (deci.equals("s"));
        return pts;
    }



    public static void main(String[] args) {
        System.out.println("Bienvenido al BLACKJACK del casino de las estafas, el primero en ganar 5 porras le deberá 100€ al casino");
        int maxPorra = 5;
        int porraJugador = ronda().charAt(0);
        int porraCrupier = ronda().charAt(1);
        while (porraJugador < maxPorra && porraCrupier < maxPorra){
            System.out.println("-----------------------------------");
            System.out.println("Porras del Jugador: "+porraJugador+"| Porras Crupier: "+ porraCrupier);
        }
        if (porraJugador==maxPorra){
            System.out.println("Has ganado LoL");

        }else {
            System.out.println("El crupier ha ganado, que malo que eres o que mala suerte, no se");
        }
    }
}
