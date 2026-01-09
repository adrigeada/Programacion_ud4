package org.example;

import java.util.Scanner;

public class EjerciciosRecursividad {
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        imprimir_menu();
        elegir_opcion();
        System.out.println("");
        repetir();

    }

    public static void imprimir_menu(){

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

    public static void elegir_opcion(){

        char modo = teclado.next().charAt(0);

        switch (modo){

            case '1':
                System.out.println(ej1(4561));
                break;
            case '2':
                System.out.println(ej2(3,4));
                break;
            case '3':
                ej3(1234);
                String frase = "Frase al reves";
                char[] frase_char = frase.toCharArray();
                ej3String(frase_char.length-1, frase_char);

                break;
            case '4':
                if (ej4(1020)){
                    System.out.println("Binario");
                }else {
                    System.out.println("No binario");
                }

                break;
            case '5':
                System.out.println(ej5(9));

                break;
            case '6':

                break;
            case '7':

                break;

            default:
        }

    }

    public static void repetir (){
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");

        char opcion = teclado.next().charAt(0);

        if (opcion == 'M') {
            main();
        }
    }

    public static int ej1 (int n){

        if (n < 10){
            return 1 ;
        }else {
             return 1+ej1(n/10);

        }


    }

    public static int ej2 (int base,int exponente){

        if (exponente == 1){
            return base;
        }else{

           return base*ej2(base,exponente-1);
        }

    }

    public static void ej3 (int num){

        if (num < 10){
            System.out.println(num);
        }else {
            System.out.print(num % 10);
            ej3(num/10);
        }

    }

    public static void ej3String(int posicion, char[] frase){

        if (posicion >= 0){
            System.out.print(frase[posicion]);
            ej3String(posicion-1,frase);
        }
    }

    public static boolean ej4 (int num){

        if (num >= 10){

            if (num % 10 == 0 || num % 10 == 1){
               return ej4(num/10);
            }else{
                return false;
            }

        } else {
            if (num == 0 || num == 1) {
                return true;
            } else {
                return false;
            }


        }
    }

    public static String ej5 (int num){

        if (num <= 1){
            return Integer.toString(num);
        }else {
            return ej5(num/2)+ num%2; //se concatena el resto

        }

    }



}
