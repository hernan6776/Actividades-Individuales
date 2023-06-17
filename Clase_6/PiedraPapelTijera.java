package Clase_6;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {

            /* - Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras",
contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
y luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar el ganador según las reglas
del juego y mostrar el resultado. */

        System.out.println(" Vamos a jugar al piedra, papel o tijeras: Elige una de las 3 contra la PC");
        Scanner teclado = new Scanner(System.in);
        String userMove = teclado.nextLine();

        int pcMove = (int) Math.floor(Math.random() * 3);
        String pc;

        if (pcMove == 1) {
            pc = "piedra";
        } else if (pcMove == 2) {
            pc = "papel";
        } else {
            pc = "tijeras";
        }

        String resultado = "";

        if (userMove.equals(pc)) {
            resultado = "empate!";
        } else if (userMove.equals("piedra") && pc.equals("papel")) {
            resultado = "Gana la PC";
        } else if (userMove.equals("papel") && pc.equals("tijeras")) {
            resultado = "gana la PC";
        } else if (userMove.equals("piedra") && pc.equals("tijeras")) {
            resultado = "GANASTE!";
        } else if (userMove.equals("papel") && pc.equals("piedra")) {
            resultado = "GANASTE!";
        } else if (userMove.equals("tijeras") && pc.equals("papel")) {
            resultado = "GANASTE!";
        }

        System.out.println("Seleccionaste " + userMove + " y la PC seleccionó " + pc + " así que " + resultado);

    }

    // otra opcion que vi que me gusto!!!!:

    /*
       Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenido al juego Piedra, Papel, Tijeras");
        System.out.println("Ingrese su elección: piedra, papel o tijeras");
        String eleccionUsuario = scanner.nextLine();

        // Generar elección aleatoria para la computadora
        String[] opciones = {"piedra", "papel", "tijeras"};
        int indiceAleatorio = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[indiceAleatorio];

        System.out.println("La elección de la computadora es: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equalsIgnoreCase(eleccionComputadora)) {
            System.out.println("Empate");
        } else if ((eleccionUsuario.equalsIgnoreCase("piedra") && eleccionComputadora.equalsIgnoreCase("tijeras"))
                || (eleccionUsuario.equalsIgnoreCase("papel") && eleccionComputadora.equalsIgnoreCase("piedra"))
                || (eleccionUsuario.equalsIgnoreCase("tijeras") && eleccionComputadora.equalsIgnoreCase("papel"))) {
            System.out.println("¡Ganaste! Felicidades");
        } else {
            System.out.println("¡Perdiste! Mejor suerte la próxima vez");
        }

        scanner.close();
     */



    // version mejorada de chat gpt

    /*
    import java.util.Random;
    import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a piedra, papel o tijeras. Elige una de las 3 opciones: piedra, papel o tijeras");
        Scanner teclado = new Scanner(System.in);
        String userMove = teclado.nextLine();

        String[] options = {"piedra", "papel", "tijeras"};
        Random random = new Random();
        String pcMove = options[random.nextInt(options.length)];

        String resultado;

        if (userMove.equals(pcMove)) {
            resultado = "Empate";
        } else if ((userMove.equals("piedra") && pcMove.equals("tijeras"))
                || (userMove.equals("papel") && pcMove.equals("piedra"))
                || (userMove.equals("tijeras") && pcMove.equals("papel"))) {
            resultado = "¡Ganaste!";
        } else {
            resultado = "Gana la PC";
        }

        System.out.println("Seleccionaste " + userMove + " y la PC seleccionó " + pcMove + ", así que " + resultado);
    }
}

     */



}
