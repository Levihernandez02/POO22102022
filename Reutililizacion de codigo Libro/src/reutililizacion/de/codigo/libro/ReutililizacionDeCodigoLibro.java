/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reutililizacion.de.codigo.libro;

import ico.fes.libros.union.Libro;

/**
 *
 * @author brain
 */
public class ReutililizacionDeCodigoLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro = new Libro();
        libro.getAutor();
        libro.getEditorial();
        libro.getNumeroDePaginas();
        libro.getTitulo();
        System.out.println(libro);
    }
    
}
