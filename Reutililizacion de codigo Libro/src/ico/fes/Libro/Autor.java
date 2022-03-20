/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.Libro;

/**
 *
 * @author brain
 */
public class Autor {
    char nombre;
    char apellido;

    public Autor() {
    }

    public Autor(char nombre, char apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public char getApellido() {
        return apellido;
    }

    public void setApellido(char apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
