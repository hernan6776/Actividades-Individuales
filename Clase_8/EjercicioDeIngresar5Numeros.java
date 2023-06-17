package Clase_8;

import java.util.Scanner;

public class EjercicioDeIngresar5Numeros {
    public static void main(String[] args) {

// tomamos el ejercio de la clase 7:Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

        // aca declaro un array para guardar los numeros
        int[] numeros = new int[5];
        cargarNumeros(numeros);
        mostrarNumeros(numeros);

        // aca el usuario carga todos los numeros
        /* esto lo reemplazariamos y quedaria como lo que esta abajo de este codigo
        for (int i = 0; i < 5; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            int numero = teclado.nextInt();
            numeros[i] = numero;
        } */

      /* aca se muestra los numeros que cargo el usuario (esta es la manera menos eficiente de hacerlo):

       System.out.println("Estos son los numeros que cargaste: ");
        for (int i=0; i < 5; i++) {
            System.out.println(numeros[i]);
        } */

    }

    //esta es la manera mas eficiente de cargar numeros:
    private static void cargarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int numero = pedirNumeroAlUsuario (); // aca lo guardamos en una variable int numero =
            numeros[i] = numero;
        }
    }

    //esta es la manera mas eficiente de mostrar numeros:
    private static void mostrarNumeros(int[] numeros) {
        System.out.println("Estos son los numeros que cargaste: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

        private static int pedirNumeroAlUsuario () { //aca le ponemos un int para que cuando se llame va a estar devolviendo un numero entero.
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingrese un numero: ");
                //int numero
                return teclado.nextInt(); //con return le decimos que esta funcion lo que va a hacer es devolver variable numero.
        }

    }
