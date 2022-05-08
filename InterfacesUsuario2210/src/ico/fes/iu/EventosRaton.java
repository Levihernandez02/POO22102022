/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author brain
 */
public class EventosRaton implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hola clic de raton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Boton presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Boton liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Cursor entro a componente");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("El cursol salio de componente");
    }
    
}
