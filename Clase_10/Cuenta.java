package Clase_10;

/* Ejercicio 2)
Crear  clase llamada Cuenta que tendrá los siguientes atributos: titular (que es una
persona) y cantidad (puede tener decimales). Construye los siguientes métodos para la clase:

● Un constructor, donde los datos pueden estar vacíos.
● Los setters y getters para cada uno de los atributos. El atributo no se puede
modificar directamente, sólo ingresando o retirando dinero.
● mostrar(): Muestra los datos de la cuenta.
● ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida
es negativa, no se hará nada.
● retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en números rojos. */

import java.util.Scanner;

public class Cuenta {

    private String titular;
    private float cantidad;

    public Cuenta() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrar() {
        System.out.println("Titular de la Cuenta: "+ titular);
        System.out.println("Cantidad: "+ cantidad);
    }

    public void ingresar() {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Indique la cantidad a ingresar");
        float cantidadIntroducidad = teclado.nextFloat();
        if (cantidadIntroducidad > 0) {
           cantidad += cantidadIntroducidad;
        }
    }

    public void retirar() {
        System.out.println("Indique la cantidad a retirar");
        Scanner teclado = new Scanner (System.in);
        cantidad -= teclado.nextFloat();
    }

}

