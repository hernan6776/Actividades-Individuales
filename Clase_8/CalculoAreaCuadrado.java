package Clase_8;

public class CalculoAreaCuadrado {

    public static void main (String [] args){
//  Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del rectangulo.
        float sumatoria = 0;
        sumatoria += getAreaCuadrado(10,15);
        sumatoria += getAreaCuadrado(20,40);
        System.out.println("sumatoria total: " + sumatoria);

    }

    private static float getAreaCuadrado(float ancho, float alto){
        return ancho * alto;
    }
}


