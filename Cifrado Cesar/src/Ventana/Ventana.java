/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author brain
 */
public class Ventana extends JFrame{
    
    private FlowLayout layout;
    private JTextField cuadroTexto;
    private JButton boton;
    private JLabel pregunta;
    private JLabel resultado;
    
    
    public Ventana() throws HeadlessException {
        
        Scanner teclado = new Scanner(System.in);
        
        String frase1 ,frase2;
        int desplazamiento;
        
        frase2 = "";
        
        String min = "abcdefghijklmnñopqrstuvwxyz ";
        String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
        
        
        System.out.print("Introduce un mensaje: ");
        frase1 = teclado.nextLine();
        
        System.out.print("Cantidad de desplazamiento: ");
        desplazamiento = teclado.nextInt();
        
        for (int i = 0; i < frase1.length(); i++) {
            for (int j = 0; j < min.length(); j++) {
                if (frase1.charAt(i) == min.charAt(j)){
                    if (j + desplazamiento >= min.length()) {
                        frase2 += min.charAt((j + desplazamiento)% min.length());
                    }
                    else{
                        frase2 += min.charAt(j + desplazamiento);
                    }
                }
                else if(frase1.charAt(i) == may.charAt(j)){
                    if (j + desplazamiento >= may.length()) {
                        frase2 += may.charAt((j + desplazamiento)% may.length());
                    }
                    else{
                        frase2 += may.charAt(j + desplazamiento);
                    }
                }
            }
        }
        this.setTitle("Cifrado Cesar");
        this.setSize(300, 200);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        cuadroTexto = new JTextField(15);
        boton = new JButton("Cifrar");
        pregunta = new JLabel ("Introduce un mensaje");
        resultado = new JLabel(frase2);
        
        this.getContentPane().add(pregunta);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.pack();
        this.setVisible(true);
        
    }
}
