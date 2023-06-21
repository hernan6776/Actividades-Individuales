package Clase_10;

import java.util.Scanner;

public class Main3 {
    public static void main (String [] args) {
        Scanner teclado = new Scanner (System.in);
        String d = "";

        Cuenta cuenta = new Cuenta ();
        cuenta.ingresar();
        cuenta.retirar();
        cuenta.mostrar();



        Cliente cliente1 = cargarCliente();
        Cliente cliente2 = cargarCliente();
        Cliente cliente3 = cargarCliente();

        /*

        localDate; -->fecha ej: localDate fecha = localDate.now(); para poner fecha actual se ponde now.
        localDateTime; --> fecha y hora
        localTime; --> hora
        */



        /* 3 - USANDO ESTA FORMA YO PODIA CARGAR CLIENTES PERO EL PROBLEMA ES QUE NO ME LO GUARDABA EN NINGUN
        LADO:
          cargarCliente();
          cargarCliente();
          cargarCliente();


         POR LO TANTO SE VAN A GENERAR DE LA SIGUIENTE MANERA PARA QUE QUEDE REGISTRADO POR CLIENTE:

         Cliente cliente1 = cargarCliente();

         */


        /* 2 - COMO ACA ESTAMOS REPITIENDO CODIGO, LO QUE HAGO ES CREAR UNA FUNCION, POR ESO AHORA VOY A
         HACER UNA FUNCION ABAJO QUE SE LLAME:  Cliente cargarCliente () -- Y ESTO DEJO DE USARLA.

       Cliente cliente1 = new Cliente();

        System.out.println("Ingrese el Nombre");
        cliente1.nombre = teclado.nextLine();

        System.out.println("Ingrese el Apellido");
        cliente1.apellido = teclado.nextLine();

        System.out.println("Ingrese el Edad");
        cliente1.edad = teclado.nextInt();

        System.out.println("Nombre: " + cliente1.nombre);
        System.out.println("Nombre: " + cliente1.apellido);
        System.out.println("Nombre: " + cliente1.edad);


        Cliente cliente2 = new Cliente();

        System.out.println("Ingrese el Nombre");
        cliente2.nombre = teclado.nextLine();

        System.out.println("Ingrese el Apellido");
        cliente2.apellido = teclado.nextLine();

        System.out.println("Ingrese el Edad");
        cliente2.edad = teclado.nextInt();

        System.out.println("Nombre: " + cliente2.nombre);
        System.out.println("Nombre: " + cliente2.apellido);
        System.out.println("Nombre: " + cliente2.edad);

         */


        /*  1 - ESTA FORMA ES COMO LO VENIAMOS HACIENDO HASTA AHORA:

        System.out.println("Ingrese el Nombre");
        String n = teclado.nextLine();

        System.out.println("Ingrese el Apellido");
        String a = teclado.nextLine();

        System.out.println("Ingrese el Edad");
        Integer e = teclado.nextInt();


        System.out.println("Ingrese el Nombre");
        String n2 = teclado.nextLine();

        System.out.println("Ingrese el Apellido");
        String a2 = teclado.nextLine();

        System.out.println("Ingrese el Edad");
        Integer e2 = teclado.nextInt();

        */

    }

    private static Cliente cargarCliente () {
        Scanner teclado = new Scanner (System.in);

        Cliente cliente = new Cliente();

        System.out.println("Ingrese el Nombre");
        // cliente.nombre = teclado.nextLine(); --> esto ya no lo usamos de esta manera, si no con setter:
        cliente.setNombre(teclado.nextLine()); // este es el setter

        System.out.println("Nombre: " + cliente.getNombre()); // este es el getter

        System.out.println("Ingrese el Apellido");
        cliente.setApellido(teclado.nextLine());
        //cliente.apellido = teclado.nextLine();


        System.out.println("Ingrese el Edad");
        cliente.setEdad(teclado.nextInt());
        //cliente.edad = teclado.nextInt();

        cliente.mostrarDatos();
        return cliente;

        /*
        TODO ESTO ACA:

        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Apellido: " + cliente.apellido);
        System.out.println("Edad: " + cliente.edad);

         LO REEMPLAZO CON  -> cliente.mostrarDatos();

        */
    }
}
