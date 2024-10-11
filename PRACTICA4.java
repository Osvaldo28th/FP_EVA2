/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String cad;
        char voc;
        int i;
        
        System.out.print("Introduce una palanbra o un texto:");
        cad = cap.nextLine();
        
        
       
        
        for(i = 0; i < cad.length(); i ++){//cad.length(); == es el numero de caracteres
            voc = cad.charAt(i); //cad.charAt(i); == es el lugar del caracter
            if (voc == 'a' || voc == 'e' || voc == 'i' || voc == 'o' || voc == 'u'){
                System.out.println(voc);
            }
        }
        
    }
    
}
