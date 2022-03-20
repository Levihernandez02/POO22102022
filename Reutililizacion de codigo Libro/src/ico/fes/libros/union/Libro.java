/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.libros.union;

import ico.fes.Libro.Autor;
import ico.fes.Libro.Editorial;

/**
 *
 * @author brain
 */
public class Libro {
    int numeroDePaginas;
    String titulo;
    Autor autor;
    Editorial editorial;

    public Libro() {
    }

    public Libro(int numeroDePaginas, String titulo, Autor autor, Editorial editorial) {
        this.numeroDePaginas = numeroDePaginas;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "numeroDePaginas=" + numeroDePaginas + ", titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

    public void setAutor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEditorial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAutor(String stephen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEditorial(String debolsillo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
