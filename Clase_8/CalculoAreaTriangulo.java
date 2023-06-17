package Clase_8;

import java.util.Scanner;

public class CalculoAreaTriangulo {
        public static void main (String [] args){
//  Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del rectangulo.

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el valor de la base: ");
            float base = scanner.nextFloat();

            System.out.print("Ingrese el valor de la altura: ");
            float altura = scanner.nextFloat();

            float areaTriangulo = getAreaTriangulo (base,altura);
            System.out.println("El area de un triangulo es: " + areaTriangulo);
        }

        private static float getAreaTriangulo (float base, float altura){
            return (base * altura)/2;
        }
}
