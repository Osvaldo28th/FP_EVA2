/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_6_NUMEROS_PARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int i, n1, n2;
        
        System.out.print("Escribe tu primer numero" + " ");
        n1 = cap.nextInt();
        cap.nextLine();
        
        System.out.print("Escribe tu segundo numero:" + " ");
        n2 = cap.nextInt();
        cap.nextLine();
       
        for (i = n1; i <= n2; i++){
            int modulo = i % 2;//residuo de la division
            if (modulo == 0)//Verdad --> sea impar para detener la impresion
                continue ;  
            System.out.print(i + "-");}
        
      
    }
    
}
