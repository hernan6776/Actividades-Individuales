package Clase_8;

public class GeneradorDePassword {
    public static void main (String[] args) {

    /*Crear una función que sea un generador de contraseñas. Al llamarla debe devolver una
    contraseña (por ejemplo, puedes utilizar Math.random() para devolver un número
    aleatorio que podría ser una contraseña. */

        String nuevoPassword = generarPassword ();
        System.out.println(nuevoPassword);
    }

    private static String generarPassword () {
        double aleatorio = Math.random() * 1000000;
        long numeroAleatorio = Math.round(aleatorio);
       return "JFDF" + "**" + numeroAleatorio;
    }
}
