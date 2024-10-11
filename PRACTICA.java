/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar una cadena de texto y un numero.
        //Imprimir la cadena el numero de veces solicitado
        
        Scanner cap = new Scanner(System.in);
        String cad;
        int num;
        
        System.out.print("Escribe tu texto:");
        cad = cap.nextLine();
        
        System.out.print("Cuantas veces deseas repetirlo:");
        num = cap.nextInt();
        
        
        for(int i = 1; i <= num; i ++){
         System.out.print(cad + "," + " ");  
    }
        
    }
    
}
