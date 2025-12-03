package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al bar de Javier");
//        System.out.println("Cuantas semanas vas a evaluar?");
//        int vueltas = teclado.nextInt();

            double[] dia = rellenarVector();

            for (int j = 0; j < dia.length; j++) {

                System.out.println(dia[j]+ " ");
            }

            masVentas(dia);



    }

    public static double[] rellenarVector(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe los valores de la semana");
        String[] semana = teclado.nextLine().split(" ");

        if (semana.length == 6){

        }
        double[] dia = new double[semana.length];

        for (int i = 0; i < semana.length; i++) {

             dia[i] =  Double.parseDouble(semana[i])  ;
        }

     return dia;
    }

    public static void masVentas (double[] dia){

        double[] copia = dia.clone();
        double aux = 0;

        for (int i = 0; i < copia.length; i++) {

            if (copia[i] > aux){

                aux = copia[i];
            }

        }
        System.out.println(aux + " Es el valor de mas ventas");



    }



}
