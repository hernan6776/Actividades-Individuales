package Clase_7;

import java.util.Scanner;

public class EjerciciosActividadNumero_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

// ### 1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos. ###

//opcion 1 - no es eficiente:
        System.out.println("------------OPCION 1 (CODIGO NO EFICIENTE)------------");

        System.out.println("Por favor ingrese un numero: ");
        int numero = teclado.nextInt();
        System.out.println(numero);

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        System.out.println(numero);

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        System.out.println(numero);

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        System.out.println(numero);

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        System.out.println(numero);

//opcion 2 - Array:
        System.out.println("--------------OPCION 2 ARRAY (CODIGO NO EFICIENTE)--------------");

        int [] numeros = new int[5]; // hacemos el array con 5 numeros que pide.

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[0] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[1] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[2] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[3] = numero;


        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[4] = numero;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);

//opcion 3 - Bucle While:

        System.out.println("--------------OPCION 3 Bucle WHILE(CODIGO NO EFICIENTE)--------------");


        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[0] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[1] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[2] = numero;

        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[3] = numero;


        System.out.println("Por favor ingrese un numero: ");
        numero = teclado.nextInt();
        numeros[4] = numero;

        int contador = 0;
        while (contador < 5) {
            System.out.println(numeros[contador]);
            contador++; // conviene ponerlo aca xq el contador estaba aumentando antes de poner la linea del print.
        }

//opcion 4 - Bucle While:

        System.out.println("--------------OPCION 4.1 BUCLE WHILE (+ EFICIENTE QUE EL 3)--------------");

        contador = 0;
        while (contador < 5) {
            System.out.println("Por favor ingrese un numero: ");
            numero = teclado.nextInt();
            numeros [contador] = numero;
            contador++;
        }

        contador = 0;
        while (contador < 5) {
            System.out.println(numeros[contador]);
            contador++;
        }

        System.out.println("--------------OPCION 4.2 BUCLE WHILE (+ EFICIENTE QUE EL 3)--------------");

        contador = 0;
        while (contador < 5) {
            System.out.println("Por favor ingrese un numero: ");
            numeros[contador] = teclado.nextInt();
            contador++;
        }

        contador = 0;
        while (contador < 5) {
            System.out.println(numeros[contador]);
            contador++;
        }

        System.out.println("--------------OPCION 4.3 BUCLE WHILE (+ EFICIENTE QUE EL 4.1 Y 4.2)--------------");

        contador = 0;
        while (contador < numeros.length) { // se saca el code smell y se pone el length, ya que no tiene sentido el numero
            System.out.println("Por favor ingrese un numero: ");
            numeros[contador] = teclado.nextInt();
            contador++;
        }

        contador = 0;
        while (contador < numeros.length) { // al poner esto le estamos diciendo el tamaño del arreglo.
            System.out.println(numeros[contador]);
            contador++;
        }


//opcion 5 - Bucle Do While:

        System.out.println("--------------OPCION 5 BUCLE DO WHILE (+ EFICIENTE QUE EL 3)--------------");
        contador = 0;
        do {
            System.out.println("Por favor ingrese un numero: ");
            numeros[contador] = teclado.nextInt();
            contador++;
        } while (contador < numeros.length);

        contador = 0;
        do {
            System.out.println(numeros[contador]);
            contador++;
        } while (contador < numeros.length);

//opcion 6 - Bucle For:

        System.out.println("--------------OPCION 6 BUCLE FOR (+ EFICIENTE QUE EL WHILE Y DO WHILE)--------------");

        for (contador = 0; contador < numeros.length; contador++) {
            System.out.println("Por favor ingrese un numero: ");
            // numero = teclado.nextInt(); - esta quito lo asignado despues del igual y lo meto abajo.
            numeros[contador] = teclado.nextInt();
        }

        System.out.println("Los numeros que usted ingreso, son: ");
        for (contador = 0; contador < numeros.length; contador++) {
            System.out.println(numeros[contador]);
        }
/*
//opcion X - Stream (es lo mas avanzado pero aun no lo vemos, en un futuro):

        System.out.println("--------------OPCION 7 BUCLE FOR (+ EFICIENTE QUE EL WHILE Y DO WHILE)--------------");

        Arrays.stream(numeros).forEach(System.out::println);

*/

        System.out.println ("EJERCICIO NUMERO 2");

// ### 2) Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.###

//opcion 1 (los resultados que va a tomar son los de la opcion 6 -bucle for- del anterior ejercicio):


        System.out.println("-------------- opcion 1: menos eficiente por el tema del 0--------------");

        int mayor = 0;
        int menor = 0;
        for (contador = 0; contador < numeros.length; contador++) {
            int num = numeros [contador];
            if (num >= mayor) {
                mayor = num;
            }
            if (num <= menor){
                menor = num;
            }
        }

        System.out.println("Numero Mayor es: "+ mayor);
        System.out.println("Numero Menor es: "+ menor);

/* el problema con esta "opcion 1" es que si los numeros que elijo x ej. (34,56,2,6,94,5) me va a  poner
como el mayor al 94 (esta ok), pero luego al elegir el menor siempre me va a poner 0 (Cero) en vez de elegir
al menor en este caso que es 2 (dos). solo apareceria en la consola un menor que yo haya puesto si lo pongo
en negativo por ejemplo (45,32,-8-4,3,12), aca el mayor seria 45 y el menor seria -8. pero tendriamos el problema
como se mostro anteriormente con los numeros enteros positivos, por lo tanto en la siguiente opcion (opcion 2)
vamos a arreglar esa cuestion.
 */

//opcion 2

        System.out.println("-------------- opcion 2: codigo eficiente para que apareza el menor real--------------");

        mayor = 0;
        menor = 0;
        for (contador = 0; contador < numeros.length; contador++) {
            int num = numeros [contador];
            if (num >= mayor || contador == 0) { // se le agrega el OR
                mayor = num;
            }
            if (num <= menor || contador == 0){ // se le agrega el OR
                menor = num;
            }
        }

        System.out.println("Numero Mayor es: "+ mayor);
        System.out.println("Numero Menor es: "+ menor);

        System.out.println ("EJERCICIO NUMERO 3");

/* ### 3) Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5,
ya que el usuario agregó 5 números. ### */

//opcion 1

        System.out.println("-------------- opcion 1: menos eficiente -------------");

        int sumatoria = 0;
        for (contador = 0; contador < numeros.length; contador++) {
            int num = numeros [contador];
            sumatoria += num;
            }

        System.out.println("La sumatoria es: "+ sumatoria);
        int promedio = sumatoria / numeros.length;
        System.out.println("El promedio es: "+ promedio);

     /*el problema de esta opcion es que no esta usando los decimales toma el numero entero al hacer
     el promedio, al hacer el integer toma numeros naturales, no esta utilizando decimales, ahora aunque le pongamos
     un float en promedio (float promedio =...) no me lo tomaria bien porque la sumatoria sigue siendo un numero
     entero, por lo tanto hay que ponerle un float adelante (Casting - conversor) como en la siguiente opcion
     que si va a mostar los decimales:
      */
//opcion 1

        System.out.println("-------------- opcion 2: mas eficiente -------------");


        int sumatoria2 = 0;
        for (contador = 0; contador < numeros.length; contador++) {
            int num = numeros [contador];
            sumatoria2 += num;
        }

        System.out.println("La sumatoria es: "+ sumatoria);
        float promedio2 = (float) sumatoria2 / numeros.length;
        System.out.println("El promedio es: "+ promedio2);

    }
}
