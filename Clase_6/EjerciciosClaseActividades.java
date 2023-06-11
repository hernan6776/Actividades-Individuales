package Clase_6;


import java.util.Scanner;

public class EjerciciosClaseActividades {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

/* 1 - Armar un buscador de países con Google Maps */

        System.out.println("Por favor ingresar un Pais: ");

        String pais = teclado.nextLine();
        System.out.println("https://www.google.com/maps/search/" + pais);

/* 2 - Armar un buscador de tweets para Twitter.com. */

        System.out.println("Ingrese el nombre de una celebridad (solo una palabra): ");

        String palabra = teclado.nextLine();
        System.out.println("https://twitter.com/search?q=" + palabra);

/* 3 - Armar un programa que permita llamar a una persona por Whatsapp*/

        System.out.println("Ingresar un numero de telefono sin espacios: ");
        int telefono = teclado.nextInt();

        System.out.println("https://api.whatsapp.com/send?phone=" + telefono);

/* 4 - Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura */

        System.out.println("Vamos a jugar a Elige tu propia Aventura.");
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso " +
                "(Elige una de las dos opciones): ");








/* 5 - Armar un programa que permita cargar 3 números y mostrar cual es el número promedio */

        System.out.println("Programa para ver cual es el numero promedio.");

        System.out.println("Cargue el primer numero:");
        int numero1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero:");
        int numero2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero:");
        int numero3 = teclado.nextInt();

        float promedio = (numero1 + numero2 + numero3);
        System.out.println("Promedio: " + promedio);

/* 6 - Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor. */

        System.out.println("Programa para ver cual es el mayor numero.");

        System.out.println("Cargue el primer numero:");
        int numero_1 = teclado.nextInt();
        System.out.println("Cargue el segundo numero:");
        int numero_2 = teclado.nextInt();
        System.out.println("Cargue el tercer numero:");
        int numero_3 = teclado.nextInt();

        if (numero_1 > numero_2 && numero_1 > numero_3) {
            System.out.println("El numero mas grande es: " + numero_1);
        } else if (numero_2 > numero_1 && numero_2 > numero_3) {
            System.out.println("El numero mas grande es: " + numero_2);
        } else {
            System.out.println("El numero mas grande es: " + numero_3);
        }

/* 7 - Muestra los números del 1 al 100 utilizando un bucle while. */

        int contador = 0;
        while (contador < 100) {
            contador ++;
            System.out.println("contador: " + contador);
        }


/* 8 - Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras",
contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
y luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar el ganador según las reglas
del juego y mostrar el resultado. */


    }
}