/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_11_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int num, i;
         int acu;
         acu = 0;
        
        while(true){   
            
        System.out.print("Introduce un numero:");
        num = cap.nextInt();
       
        if (num > acu){
        acu = num;    
        }
        
        if (num < 0){
        break;}
        }//CIERRE DEL WHILE
        System.out.println("El numero mayor es:" + acu);
    }   
}
