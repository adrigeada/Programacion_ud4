package org.example;

import java.util.Scanner;

public class ej2Recursividad {
    static int limite = 10;

    static void main() {
        contar(1);

    }


    static void contar (int inicio){

        if (inicio <= limite){
            System.out.println(inicio);
            contar(inicio+1);
        }

    }
}
