package Clase_5;/* 3) Calculadora de descuento:
        Pídele al usuario que ingrese el precio original de un producto.
        Pídele al usuario que ingrese el porcentaje de descuento.
        Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        Muestra el precio final al usuario.*/

import java.util.Scanner;

public class CalculadoraDeDescuento {
    public static void main(String[] args) {
        System.out.println("Ingrese el precio original de un producto: ");
        Scanner baseDeEjercicios = new Scanner(System.in);
        double precioOriginal = baseDeEjercicios.nextDouble();

        System.out.println("Ahora ingrese el porcentaje de descuento: ");
        double descuento = baseDeEjercicios.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final con el descuento es: $" + precioFinal);
    }
}
