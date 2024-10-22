/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cant;
        int cal[];
        String nom[];
        Scanner cap = new Scanner(System.in);
        
        System.out.print("Cantifad de calificaiones a capturar:");
        cant = cap.nextInt();
        cap.nextLine();
        cal = new int[cant];
        nom = new String[cant];
        
        for (int i = 0; i < cal.length; i++) {
            System.out.println("Nombre del estudiante #" + i);
            nom[i] = cap.nextLine();
            System.out.println("Calificacion estudiante #" + i);
            cal[i] = cap.nextInt();
            cap.nextLine();
        }
        
        //IMPRIMIR CALIFAS 
        
        for (int i = 0; i < cal.length; i++) {
        
            System.out.print(nom[i] + ":" + " " + cal[i] + " " + "-"  + " ");
         
        }
        
    }
    
}
