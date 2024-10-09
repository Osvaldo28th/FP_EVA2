/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        int cal, sumcal, prom;
        //ACUMULADOR --> 
        //int acum = acum + 1;
        // = --> Asignacion
        // == --> Comparacion
        sumcal = 0;
        prom = sumcal / 10;
        
        
        
        
        for(int i = 1; i <= 10.0; i++){
            System.out.println("Estudiante #" + i);
             System.out.println("Cual es tu califiacion:");
            cal = cap.nextInt();
            cap.nextLine();
            System.out.println("*****************************************");            //Acumulador
            sumcal = sumcal + cal;
            prom = sumcal / 10;
       
        }
        System.out.println("La suma de las calificacion es:" + sumcal);
        System.out.println("*****************************************   ");
        System.out.println("El promedio es:" + prom);
        
        }
    
}
