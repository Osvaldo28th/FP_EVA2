/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int num, pot;
        
        
        System.out.println("Cual numero deseas elevear:");
        num = cap.nextInt();
        cap.nextLine();
        
        System.out.println("A que potencia:");
        pot = cap.nextInt();
        cap.nextLine();
        int res;
        res = 1;
        for(int i = 1; i <= pot; i++){
            res = res * num;
            
        }
            System.out.println("El resultado es:" + " " + res);
        

    }
    
}
