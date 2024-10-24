package com.marcosferrandiz.tema04.libreria;

import java.util.Random;

public class rng {

    /**
     * Saca un numero aleatorio en el margen que le indiquemos
     * @param numMin El numero minimo
     * @param numMax El numero maximo
     * @return Saca el numero aleatorio
     */
    public static int notaAleatoria(int numMin, int numMax){
        Random rng = new Random();
        int numero = rng.nextInt(numMin,numMax+1);
        return numero;
    }


}
