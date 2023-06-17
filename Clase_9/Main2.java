package Clase_9;

import java.util.Scanner;

public class Main2 {
    public static void main(String[]args) {

        /* String [] personas = new String[10];
        personas[0]= "Lucas Moy";
        personas[1]= "Aldo Angelini";
        personas[3]= "Julia Gomez";*/

        String [] personas = {"Lucas Moy","Aldo Angelini","Julia Gomez", "Manuel Santillan", "Juan Torres" };

        System.out.println("Ingrese su busqueda: ");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine(); // nextline para que busca el nombre y apellido de la persona. si no solo busca la primera palabra.

        System.out.println("-------para que solo busque una determinada palabra (por ej.Gom------------");

        for (String nombrePersona: personas) {
            if (nombrePersona.toLowerCase().contains(busqueda.toLowerCase())){ // tolower case para minusculas
                System.out.println("La persona encontrada es: " + nombrePersona);
            }
        }

        // Arrays.stream(personas).parallel.filter(nombre-> nombre.contains(busqueda));

     /* for (String nombrePersona: personas) {
            if (busqueda.equalsIgnoreCase(nombrePersona)) { // se le pone ignore case para que busque tanto si lo escribimos con mayusculas o minusculas.
                System.out.println("La persona encontrada es: " + nombrePersona);
            }
        } */

        /*
        for (int i = 0; i <personas.length; i++) {
            String personaEcontrada = personas[i];
            if(busqueda.equals(personaEcontrada)){
                System.out.println("La persona encontrada es: " + personaEcontrada);
            }
        }
        //System.out.println(personaEcontrada);
         */
    }
}
