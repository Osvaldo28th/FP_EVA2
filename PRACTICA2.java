/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class PRACTICA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Solicitar 2 numeros. 
        //Imprimir todos los numeros entre esos 2 en orden y ascendente
        Scanner cap = new Scanner(System.in);
        int num, num2;
        
        System.out.println("Cual es tu primer numero:");
        num = cap.nextInt();
        cap.nextLine();
        
        System.out.println("Cual es tu segundo numero:");
        num2 = cap.nextInt();
        cap.nextLine();
        System.out.println("*****************************");
        
        
        for(int i = num; i <= num2; i ++){
            System.out.println(i);
        }
        
        System.out.println("*****************************");
        
        for(int i = num2; i >= num; i --){
            System.out.println(i);
    }
    }
    
}
