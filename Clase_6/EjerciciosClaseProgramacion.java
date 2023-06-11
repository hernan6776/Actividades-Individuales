package Clase_6;

import java.util.Scanner;

public class EjerciciosClaseProgramacion {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

    // #1 - Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor”

        System.out.println("Programa para ver cual es el mayor numero.");

        System.out.println("Cargue el primer numero:");
        int numero_1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero:");
        int numero_2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero:");
        int numero_3 = teclado.nextInt();

        if (numero_1 > numero_2 && numero_1 > numero_3 ){
            System.out.println("El numero mas grande es: " + numero_1);
        }
        else if (numero_2 > numero_1 && numero_2 > numero_3 ){
            System.out.println("El numero mas grande es: " + numero_2);
        } else {
            System.out.println("El numero mas grande es: " + numero_3);
        }

/* #2 - Armar un programa que permita cargar 3 números y mostrar cual es el número promedio”
Ejemplo: Si cargo 2, 6 y 9, el promedio es 5.66
+/ */
        System.out.println("Programa para ver cual es el numero promedio.");

        System.out.println("Cargue el primer numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero:");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero:");
        int numero3 = teclado.nextInt();

        float promedio = (numero1 + numero2 + numero3);
        System.out.println("Promedio: " + promedio);

/* #3 - Armar un programa que permita ingresar un número y mostrar si es par o impar */

        System.out.println("Programa que permite ver si un numero es par o impar.");

        int numero = teclado.nextInt();
        int resto = numero % 2;

        if (resto == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("Es numero es impar");
        }

/* ejercicio contador while */
        int contador = 0;
        while (contador < 3) {
            contador ++;
            System.out.println("contador: " + contador);
        }
    }
}

//