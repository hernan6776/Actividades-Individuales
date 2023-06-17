package Clase_8;

public class EjerciciosClaseDescuento1 {
    public static void main(String[] args) {

        /* esta forma de hacerno no es eficiente, ya que estamos repitiendo codigo cada vez que queremos realizar
        una funcion de descuento*/

       String producto;
        double precio;
        double porcentaje_descuento;
        double precio_final;

        producto = "Pantalon";
        precio = 40;
        porcentaje_descuento = 20;
        precio_final = precio - (porcentaje_descuento * precio) / 100;
        System.out.println("El precio del " + producto + "es: $" + precio_final);

        producto = "Camisa";
        precio = 30;
        porcentaje_descuento = 15;
        precio_final = precio - (porcentaje_descuento * precio) / 100;
        System.out.println("El precio del " + producto + "es: $" + precio_final);

    }
}