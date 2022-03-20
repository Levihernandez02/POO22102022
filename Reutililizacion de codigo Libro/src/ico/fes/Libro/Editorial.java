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
public class Editorial {
    String casaEditorial;
    int ejemplares;

    public Editorial() {
    }

    public Editorial(String casaEditorial, int ejemplares) {
        this.casaEditorial = casaEditorial;
        this.ejemplares = ejemplares;
    }

    public String getCasaEditorial() {
        return casaEditorial;
    }

    public void setCasaEditorial(String casaEditorial) {
        this.casaEditorial = casaEditorial;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Editorial{" + "casaEditorial=" + casaEditorial + ", ejemplares=" + ejemplares + '}';
    }
    
    
}
