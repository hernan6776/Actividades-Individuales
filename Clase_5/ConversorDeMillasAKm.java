package Clase_5;/* 2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.  */

import java.util.Scanner;

public class ConversorDeMillasAKm {
        public static void main(String[] args) {
            System.out.println("Conversor de Millas a Kilometros - Ingrese distancia en millas: ");
            Scanner baseDeEjercicios = new Scanner(System.in);
            double millas = baseDeEjercicios.nextDouble();

            double kilometros = millas * 1.60934;
            System.out.println("La distancia ingresada a millas es: " + millas + " su distancia convertida " +
                    "en kilometros es: " + kilometros);
        }
}
