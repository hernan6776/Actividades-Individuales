/*
package Clase_10;

import java.time.LocalDate;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaDeNacimiento;
    private int dni;

    public Persona(int id,String nombre,String apellido,int edad,String fechaDeNacimiento,int dni){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaDeNacimiento = parseFecha(fechaDeNacimiento);
        this.dni = dni;
    }

    private LocalDate parseFecha(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(fecha, formatter);
    }




        /*

Construye los siguientes métodos para la clase:

● Un constructor, donde los datos pueden estar vacíos.

● Los setters y getters para cada uno de los atributos.

● mostrar(): Muestra los datos de la persona.

● esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad



}
   */