/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar_2;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_10_VALIDAR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner cap = new Scanner(System.in);
        int dia;
        
        while (true){
            
          
            System.out.print("Numero correspodiente al dia (1-7):");
        dia = cap.nextInt();
        
        if (dia >= 1 || dia <=7){
            System.out.println("");
        break;}
       
        }
        
        switch (dia){
            case 1:
                System.out.println("Es lunes");
                break;//Fin de la instruccion
                case 2:
                System.out.println("Es martes");
                break;
                case 3:
                System.out.println("Es miercoles");
                break;
                case 4:
                System.out.println("Es jueves");
                break;
                case 5:
                System.out.println("Es viernes");
                break;
                case 6:
                System.out.println("Es sabado");
                break;
                case 7:
                System.out.println("Es domingo");
                break;
                default://Ultima seccion del switch
                    System.out.println("Numero no valido del (1-7)");
        }
        
        
     
    }
    
}
