/*
 * Cliente.java
 *
 *
 */
package ar.com.educacionit.lab3.ejercicio2;

/**
 *
 * @author Sebastián S. Sanga <SebastianSanga@gmail.com>
 */
public class Cliente {

    /**
     * Creates a new instance of Cliente
     */
    public Cliente() {
    }

    public Cliente(String unNombre, String unDni) {
        nombre = unNombre;
        dni = unDni;
    }

    // Atributos
    private String nombre;
    private String dni;

    // Redefinicion del metodo equals() de la clase Object
    public boolean equals(Object obj) {
        // Casteo el objeto a Cliente
        Cliente c = (Cliente) obj;

        // Chequea si los dni son iguales
        if (c.getDni().equals(this.getDni())) {
            return true;
        }

        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
