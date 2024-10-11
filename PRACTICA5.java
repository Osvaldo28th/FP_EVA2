/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        
        int num;
        
        System.out.print("Escribe un numero:");
        num = cap.nextInt();
        cap.nextLine();
        
        String acum;
        acum = "";
        for (int i = 1; i <= num; i++ ){
        acum = acum + "*" ;
            System.out.println(acum);
        }
    }
    
}
