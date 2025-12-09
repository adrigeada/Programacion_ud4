package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Problema196 {
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        System.out.println("¿Cuantas tablas de sudoku quieres crear?");
        int casos = 0;

       do {
           try {
               casos = teclado.nextInt();
               break;
           }catch (InputMismatchException e){
               System.out.println("Hay que poner números");
               teclado.nextLine();
           }
       }while (true);

        teclado.nextLine();

        for (int i = 0; i < casos; i++) {
            principal();
        }

    }

    public static void principal(){

        String tabla[][] = rellenarTabla();

        for (String fila[] : tabla ){
            System.out.println(Arrays.toString(fila));
        }

        if (!checkCantidad(tabla)){
            System.out.println("NO");

        }else if (checkSimetria(tabla)){
            System.out.println("SI");

        }else {
            System.out.println("NO");
        }

    }

    public static String[][] rellenarTabla(){

        String[][] tabla = new String[9][9];

        fuera:
        for (int i = 0; i < tabla.length; i++) {

            System.out.println("Inserta la línea " +(i+1));
            String[] linea = teclado.next().split("");
            if (linea.length == tabla.length){

                for (int j = 0; j < tabla[i].length; j++) {

                    if (linea[j].matches("[1-9-]")){
                        tabla[i][j] = linea[j];
                    }else {
                        System.out.println("El sudoku se deber rellenar con números del 1 al 9 y guiones");
                        i--;
                        continue fuera;
                    }

                }

            }else {
                System.out.println("La línea del sudoku tiene que tener 9 espacios");
                i--;
                continue fuera;
            }

        }
        return tabla;
    }

    public static boolean checkCantidad(String[][]tabla){

        int contadorNum = 0;
        for (int i = 0; i < tabla.length; i++) {

            for (int j = 0; j < tabla[i].length; j++) {
                if (!tabla[i][j].equals("-")){ //Se recorre la matriz, si en los huecos hay algo diferente a -, contador++
                    contadorNum++;
                }

            }

        }

        if (contadorNum < 32){
            return true;
        }else{
            System.out.println("Este sudoku tiene más de 32 huecos rellenos. Mal sudoku :(");
            return false;
        }

    }

    public static boolean checkSimetria(String[][] tabla){
        boolean arriba = false;
        boolean abajo = false;
        boolean simetria = true;

        fuera:
        for (int i = 0; i < tabla.length / 2; i++) {


            for (int j = 0; j < tabla[i].length; j++) {


                if (tabla[i][j].equals("-")){
                    arriba= true;
                }else {
                    arriba=false;
                }
                if (tabla[8-i][8-j].equals("-")){
                    abajo = true;
                }else {
                    abajo=false;
                }

                if (arriba!= abajo){
                    simetria = false;
                    break fuera;
                }

            }
        }

        return simetria;
    }



}
