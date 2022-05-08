/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author brain
 */
public class MiVentana extends Frame implements MouseListener{

    private Button boton1;
    private FlowLayout layout;
    private TextField cuadroTexto;
    private Label etiqueta;
    
    
    
    public MiVentana() throws HeadlessException {
        setTitle("Mi Ventana");
        setSize(300, 200);
        layout=new FlowLayout();
        setLayout(layout);
        boton1= new Button("Saludar");
        cuadroTexto = new TextField(15);
        etiqueta = new Label("Valor Inicial");///// Minuto 49:00 me quede 
        this.boton1.addMouseListener(this);
        
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
         
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clic");
        //System.out.println(cuadroTexto.getText());
        etiqueta.setText("Hola " + cuadroTexto.getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberado");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Entro");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Salio");
    }
    
}
