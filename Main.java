import java.util.Scanner;

// ejercicio 1) crear un hola mundo
public class Main {
    public static void main(String[] args) {
            System.out.println("Hola, Mundo!");

// Ejercicio 2) ver si una persona es mayor de edad
        Integer edad = 30; // 1ro para declarar variable hay que ponerle el tipo (Integer), luego nombre de la variable (edad)
        // y luego asignamos el valor (30) y con el punto y coma cerramos la sentencia.
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }

// Ejercicio 3) ver si una persona es mayor de edad o menor de edad s/correponda

        //opcion 1 (mayor de edad):
        Integer edad2 = 30;

        if (edad2 >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        //opcion 2 (menor de edad):

        Integer edad3 = 16;

        if (edad3 >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
// Ejercicio 4) persona es > de edad o < de edad pero haciendo que el usuario lo agregue en la terminal
        System.out.println("¿que edad tienes?");
        Scanner cargaDeDatos = new Scanner(System.in);  // vamos a crear una variable de tipo Scanner
        Integer edad4 = cargaDeDatos.nextInt();

        if (edad4 >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

// Ejercicio 5) operadores logicos

        Integer edad5 = 25;
        Boolean esMayor = edad5 >= 18 && edad5 < 70; // aca creamos una varible booleana. aca genera un valor true.
        Boolean esMayor2 = !(edad5 < 18 || edad5 >= 70); /* aca invertimos esta secuencia, el restulado de lo que esta dentro del parentesis,
         lo invierto con un simbolo de exclamacion (!), por lo tanto si la edad es de 25 años, la primera pregunta: ¿edad es menor que 18?
         la respuesta es NO, segunda pregunta: ¿edad es mayor o igual a 70? TAMPOCO, entonces ninguna de esas dos se cumple asi que es
         falso, pero el simbolo de exclamacion (!) me invierte la sentencia, y termina siendo true como en la primera. */
        System.out.println(esMayor);
        System.out.println(esMayor2);

// Ejercicio 6) Calculadora de IMC
    // Peso en KG / altura en metros al cuadrado.
        double peso = 75; // la variable de tipo double sirve para poder guardar decimales (≠ Integer que es para numeros enteros).
        double altura = 1.83;
        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal);

    //Mayor a 30 -> obesidad
        if (indiceMasaCorporal >= 30) {
            System.out.println("Estas en estado de Obesidad");
        }
    //Entre 25 y 30 --> sobrepeso
        if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("Estas en estado de Sobrepeso");
        }
    //Entre 18.6 y 25 --> normal
        if (indiceMasaCorporal >= 18.6 && indiceMasaCorporal < 25) {
            System.out.println("Estas en estado Normal");
        }
    //Menor a 18.6 --> debajo de lo normal
        if (indiceMasaCorporal < 18.6) {
            System.out.println("Estas Debajo de lo Normal");
        }
// Ejercicio 7) hacemos lo mismo que antes pero cargado el peso desde consola:

        Scanner cargaDeDatosIMC = new Scanner(System.in);
        System.out.println("Indica tu peso en KG: ");
        double peso2 = cargaDeDatos.nextDouble(); // en vez de nextINT voy a poner nextDouble para que me cargue un numero con decimales.
        System.out.println("Indica tu altura en metros: ");
        double altura2 = cargaDeDatos.nextDouble();
        double indiceMasaCorporal2 = peso2 / (altura2 * altura2);
        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal2);


       if (indiceMasaCorporal2 >= 30) {
            System.out.println("Estas en estado de Obesidad");
            }
       if (indiceMasaCorporal2 >= 25 && indiceMasaCorporal2 < 30) {
            System.out.println("Estas en estado de Sobrepeso");
            }
            //Entre 18.6 y 25 --> normal
       if (indiceMasaCorporal2 >= 18.6 && indiceMasaCorporal2 < 25) {
            System.out.println("Estas en estado Normal");
            }
            //Menor a 18.6 --> debajo de lo normal
       if (indiceMasaCorporal2 < 18.6) {
            System.out.println("Estas Debajo de lo Normal");

       }
    }
}