/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int num, i, l;
        
        System.out.print("Escribe un numero:");
        num = cap.nextInt();
        cap.nextLine();
        
        String acum;
        acum = "";
        for(i = 1; i <= num; i ++){
            acum = acum + "*";
            System.out.println(acum);
        }
       
         String acu;
        acu = "*";
         for ( i = num; i > 0; i--) {
           
            
            for (l = 1; l <= i; l++) {
              
                System.out.print(acu);
            }
            System.out.println();
        }
        
        
        
    }
}
