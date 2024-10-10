/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int num;
        
        System.out.print("Cual es tu numero:" + " ");
        num = cap.nextInt();
        cap.nextLine();
        
        
        int res;
        res = 1;
        for(int i = 1; i <= num; i ++){
            res = res * i;
        }
        System.out.println("Su factorial es:" + " " + res);
        
    }
    
}
