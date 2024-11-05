package com.marcosferrandiz.tema04.fechas;

import com.marcosferrandiz.tema04.libreria.IO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Modifica la fecha a una que escriba el usuario
     * @return Devuelve la fecha introducida por el usuario
     */
    public static LocalDate modificacionFecha(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaMod = IO.solicitarString("Indique la fecha que quieras poner", 1, 11);
        return LocalDate.parse(fechaMod, dateTimeFormatter);
    }


    /**
     * Suma los años indicacos por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que sumar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate sumarAnyos(LocalDate fecha) {
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de años que quiera sumar con un máximo de 100 años", 1, 101);
        return fecha.plusYears(cosaSumar);
    }

    /**
     * Resta los años indicados por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que restar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate restarAnyo(LocalDate fecha){
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de años que quiera restar con un máximo de 100 años", 1, 101);
        return fecha.minusYears(cosaSumar);
    }

    /**
     * Suma la cantidad de meses endicados por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que sumar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate sumarMeses(LocalDate fecha){
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de meses que quiera sumar con un máximo de 50 meses", 1, 51);
        return fecha.plusMonths(cosaSumar);
    }

    /**
     * Resta los meses indicados por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que restar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate restarMeses(LocalDate fecha){
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de meses que quiera restar con un máximo de 50 meses", 1, 51);
        return fecha.minusMonths(cosaSumar);
    }

    /**
     * Suma la cantidad de dias introducido por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que sumar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate sumarDias(LocalDate fecha){
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de dias que quiera sumar con un máximo de 1095 dias dias(3 años)", 1, 1096);
        return fecha.plusDays(cosaSumar);
    }

    /**
     * Resta la cantidad de dias introducidos por el usuario
     * @param fecha Es la fecha indicada la cual le tendremos que restar a esta
     * @return Devuelve la nueva fecha
     */
    public static LocalDate restarDias(LocalDate fecha){
        int cosaSumar = IO.solicitarEntero("Indique la cantidad de dias que quiera restar con un máximo de 1095 dias dias(3 años)", 1, 1096);
        return fecha.minusDays(cosaSumar);
    }


    /**
     * Hace un submenu el cual nos dirá diferentes opciones de calculos que se pueden hacer en las fechas
     * @param fecha Es la fecha indicada la caul tendremos que modificar
     * @return Devuelve la fecha modificada
     */
    public static LocalDate operacionesFecha(LocalDate fecha){
        System.out.println("********************************** \n***         OPERACIONES        ***");
        System.out.printf("*** FECHA CALCULADA: %s ***\n", fecha);
        System.out.println("**********************************");
        System.out.println("1. Sumar años\n2. Sumar meses\n3. Sumar días\n4. Restar años\n5. Restar meses\n6. Restar días");
        System.out.println("-----------------------------------");
        System.out.println("0. Volver al menú principal");
        Scanner input = new Scanner(System.in);
        int oper = Integer.parseInt(input.nextLine());
        return switch (oper){
            case 1 ->sumarAnyos(fecha);
            case 2 ->sumarMeses(fecha);
            case 3 ->sumarDias(fecha);
            case 4 ->restarAnyo(fecha);
            case 5 ->restarMeses(fecha);
            case 6 ->restarDias(fecha);
            default -> fecha;
        };
    }


    public static void main(String[] args) {
        LocalDate fechAct = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaAhora = fechAct.format(dateTimeFormatter);
        LocalDate fecha = LocalDate.parse(fechaAhora, dateTimeFormatter);
        Scanner input = new Scanner(System.in);
        int deci;

        do {

            System.out.println("***********************************");
            System.out.printf("*** FECHA CALCULADA: %s ***\n", fecha);
            System.out.println("***********************************");
            System.out.println("1. Modificar fecha calculada\n2. Operaciones …");
            System.out.println("-----------------------------------");
            System.out.println("0. Salir del programa");
            deci = Integer.parseInt(input.nextLine());
            switch (deci) {
                case 0-> {
                    break;
                }
                case 1 -> fecha = modificacionFecha();
                case 2 -> fecha = operacionesFecha(fecha);
                default -> System.err.println("El valor introducido no es válido, por favor introduzca uno bien, que no es dificil elegir entre 0, 1 y 2, que no hay perdida");
            }

        } while (deci != 0);
    }
}
