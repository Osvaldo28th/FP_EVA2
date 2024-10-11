/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String cad;
        
        System.out.print("Introduce tu texto:");
        cad = cap.nextLine();
        
        for(int i = 0; i < cad.length(); i++){
            System.out.println(cad.charAt(i));
        }
    }
    
}
