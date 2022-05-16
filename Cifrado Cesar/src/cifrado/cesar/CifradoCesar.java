/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifrado.cesar;

import java.util.Scanner;

/**
 *
 * @author brain
 */
public class CifradoCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String frase1 ,frase2;
        int desplazamiento;
        
        frase2 = "";
        
        String min = "abcdefghijklmnñopqrstuvwxyz ";
        String may = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
        
        System.out.print("Introduce una frase: ");
        frase1 = teclado.nextLine();
        
        System.out.print("Introduce la clave de desplazamineto: ");
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
        System.out.println(frase1);
        System.out.println(frase2);
    }
    
}
