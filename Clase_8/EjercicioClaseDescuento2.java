package Clase_8;

public class EjercicioClaseDescuento2 {
    //esta forma va a ser mas eficiente que Descuento1 ya que usamos funciones y no repetimos codigo.
    public static void main(String[] args) {
    calcularPrecioFinal("Pantalon", 40, 20);
    calcularPrecioFinal("Camisa", 30, 15);}

    public static void calcularPrecioFinal(String producto, double precio, double porcentaje_descuento) {
        double precio_final = precio - (porcentaje_descuento * precio) / 100;
        System.out.println("El precio del " + producto + "es: $" + precio_final);

    }
}
