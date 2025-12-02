package org.example;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = teclado.nextInt();
        int resultado = cubo(numero);
        System.out.println(resultado);


    }

    public static int cubo(int numero){

        return numero*numero*numero;
    }


}
