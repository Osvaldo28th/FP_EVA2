/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {10, 50, 85, 73, 11, 25, 43, 5, 0, 6};
        Scanner cap = new Scanner(System.in);
        int num, pos = -1;
        
        System.out.print("Numero a buscar:");
        num = cap.nextInt();
        
        for (int i = 0; i < datos.length; i++) {
            if(num == datos[i]){
                pos = i;
                
                break;
            }
        }
        if (pos == -1){
            System.out.println("Valor no encontrado");
        
        }else{
        System.out.println("La posicion es" + " " +pos);}
        }
    
}
