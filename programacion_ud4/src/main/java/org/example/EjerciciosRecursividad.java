package org.example;

import java.util.Scanner;

public class EjerciciosRecursividad {
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        imprimir_menu();
        elegir_opcion();
        repetir();

    }

    static void imprimir_menu(){

        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar...");
        System.out.println("1 - Dígitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabético");
        System.out.println("7 - Mostrar suma");

    }

    static void elegir_opcion(){

        char modo = teclado.next().charAt(0);

        switch (modo){

            case '1':
                System.out.println(ej1(4561));
                break;
            case '2':
                System.out.println(ej2(3,4));
                break;
            case '3':

                break;
            case '4':

                break;
            case '5':

                break;
            case '6':

                break;
            case '7':

                break;

            default:
        }

    }

    static void repetir (){
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");

        char opcion = teclado.next().charAt(0);

        if (opcion == 'M') {
            main();
        }
    }

    static int ej1 (int n){

        if (n < 10){
            return 1 ;
        }else {
             return 1+ej1(n/10);

        }


    }

    static int ej2 (int base,int exponente){

        if (exponente == 1){
            return base;
        }else{

           return base*ej2(base,exponente-1);
        }

    }

    static int ej3 (int num){

        if (num < 10){
            return num;
        }else {
            num = num%10;
            return ej3(num/10);
        }

    }

}
