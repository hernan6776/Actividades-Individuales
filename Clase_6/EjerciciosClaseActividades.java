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

        System.out.println("""
                    Vamos a jugar a "Elige tu propia Aventura".
                    Es una noche estrellada, te encuentras en un bosque misterioso.
                    opcion 1: Exploras la oscuridad en busca de la fuente de un susurro escalofriante.
                    opcion 2: Sigues el sendero iluminado hacia una pequeña cabaña acogedora.
                    Elige una de las dos opciones, presionando 1 o 2:""");
        int opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("El jugador muere");
        } else {
            System.out.println("""
                    Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora.
                    Al llegar a la cabaña, te das cuenta de que hay dos puertas:
                    opcion 1: Entras por la puerta de la izquierda.
                    opcion 2: Optas por la puerta de la derecha.
                    Elige una de las dos opciones, presionando 1 o 2""");
                int opcion2 = teclado.nextInt();
            if (opcion2 == 1) {
                System.out.println("""
                    Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.
                    Te maravillas con las joyas y los objetos preciosos que llenan la sala.
                    Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.
                    Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo.
                    ¡Felicidades, has tenido un final exitoso en tu búsqueda!""");
            } else {
                System.out.println("el jugador muere");
            }
        }

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
