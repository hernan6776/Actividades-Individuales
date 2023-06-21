package Clase_10;

public class Cliente {
    private String nombre;
    private String apellido;
    private Integer edad;
    /* a las variables ↑↑↑ como las de arriba, aca en CLASE se las llama "propiedades", por lo tanto estas
    son las propiedades de la clase cliente */

    /* esta es una funcion como la de abajo ↓↓↓ , cuando a una funcion se la crea dentro de una CLASE se la llama metodo,
     aca el metodo es mostrarDatos.
     */
    public void mostrarDatos () {
        System.out.println("Nombre Completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }

    //la idea de tener setters y getters es tener un mejor control de entrada y salida de datos de nuestra clase.

    //esta funcion devuelve la variable nombre:

    //esta funcion modifica el valor nombre:
    public String getNombre () {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
