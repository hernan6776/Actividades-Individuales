package Clase_5;/* 4) Calculadora de propinas:
        Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/

import java.util.Scanner;

public class CalculadoraDePropinas {
    public static void main(String[] args) {
        System.out.println("Ingrese el total de la cuenta en un restaurante: ");
        Scanner baseDeEjercicios = new Scanner(System.in);
        double totalCuenta = baseDeEjercicios.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = baseDeEjercicios.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);
        System.out.println("El total de la propina es de: $" + propina);
    }
}
