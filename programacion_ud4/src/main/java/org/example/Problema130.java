package org.example;

import java.util.Scanner;

public class Problema130 {

static Scanner teclado = new Scanner(System.in);


    static void main() {
        while (casoDePrueba()){

        }
    }


    public static boolean casoDePrueba(){

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();



        if (x == 0 || y == 0){
            return false;
        }else {
            return true;
        }


    }


}
