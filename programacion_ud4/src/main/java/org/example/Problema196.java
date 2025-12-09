package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Problema196 {
    static Scanner teclado = new Scanner(System.in);

    static void main() {
        System.out.println("¿Cuantas tablas de sudoku quieres crear?");
        int casos = teclado.nextInt();
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
        }else {

            //check simetria
        }

    }

    public static String[][] rellenarTabla(){

        String[][] tabla = new String[9][9];

        for (int i = 0; i < tabla.length; i++) {

            System.out.println("Inserta la línea " +(i+1));
            String[] linea = teclado.next().split("");
            if (linea.length == tabla.length){

                for (int j = 0; j < tabla[i].length; j++) {

                    if (tabla[i][j].matches("[1-9-]")){
                        tabla[i][j] = linea[j];
                    }
                    
                }

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

        if (contadorNum >= 32){
            return true;
        }else{
            return false;
        }

    }



}
