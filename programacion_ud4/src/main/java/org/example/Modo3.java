package org.example;

import java.util.Scanner;

public class Modo3 {

    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {

            //codigo

            return true;
        }
    }


}
