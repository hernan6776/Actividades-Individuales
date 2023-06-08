package Clase_5;/* 1) Calculadora de edad de perros: Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro). */

import java.util.Scanner;

public class CalculadoraEdadDePerros {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la calculadora de edad de perros - Ingrese la edad de su perro: ");
        Scanner baseDeEjercicios = new Scanner(System.in);
        Integer edadDePerro = baseDeEjercicios.nextInt();

        Integer edadConvertidaHumano = edadDePerro*7;
        System.out.println("La edad de su perro es: " + edadDePerro + " y convertido en años humanos es: " + edadConvertidaHumano);
    }
}
