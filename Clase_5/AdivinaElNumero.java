package Clase_5;/* 5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/

import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        Integer numeroRandom = (int)(Math.random()*100);

        System.out.println("Ingrese un numero entre 1-100 para adivinar el numero secreto: ");
        Scanner baseDeEjercicios = new Scanner(System.in);
        Integer numeroUsuario = baseDeEjercicios.nextInt();

        if (numeroUsuario == numeroRandom){
            System.out.println("Felicitaciones Acertaste. El numero secreto es: " + numeroRandom);
        } else {
            System.out.println("Numero Incorrecto. El numero secreto era: " + numeroRandom);
        }
    }
}