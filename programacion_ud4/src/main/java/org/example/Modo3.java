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

            int toros = teclado.nextInt();
            int rapido = 0;
            for (int i = 0; i < toros; i++) {
                    int velocidad_toro= teclado.nextInt();

                    if (velocidad_toro > rapido){
                        rapido = velocidad_toro;
                    }
            }
            System.out.println(rapido);
            teclado.nextLine();



            return true;
        }
    }


}
