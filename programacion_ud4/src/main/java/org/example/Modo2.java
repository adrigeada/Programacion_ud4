package org.example;

import java.util.Scanner;

public class Modo2 {

    static Scanner teclado;

    public static void main(String[] args) {

         teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {

        int x = teclado.nextInt();
        int y = teclado.nextInt();
        teclado.nextLine();

        if (y<0 || x<0)
        return false;
        else {
            //codigo
            return true;
        }
    }



}
