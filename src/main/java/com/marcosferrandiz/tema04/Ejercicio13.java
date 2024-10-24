package com.marcosferrandiz.tema04;

import java.util.Scanner;

public class Ejercicio13 {
    /**
     * Metodo que recibe un numbre y una letra que dara acceso a un switch el cual sacará en un idioma u otro
     * @param nombre Es un String en el cual hay que poner el nombre
     * @param idioma Es un char el cual indicara que idioma
     * @return Devuelve un String con el texto en el idioma seleccionado y con el nombre indicado
     */
    public static String Salu2(String nombre, char idioma){
        String saludo = "";
        String resultado = switch (idioma){
            case 'a' -> "Bon dia "+ nombre;
            case 'b' -> "Buenos dias "+ nombre;
            case 'c' -> "Good morning "+ nombre;
            default -> "Valor equivocado";
        };
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Indique el nombre");
        String nombre = input.nextLine();
        System.out.println("Indique el idioma  [a] Valenciano | [b] Castellano | [c] Ingles");
        char idioma = input.nextLine().charAt(0);
        input.close();
        System.out.println(Salu2(nombre,idioma));


    }
}
