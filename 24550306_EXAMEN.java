/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg24550306_examen2;

/**
 *
 * @author Osvaldo Chavez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner cap = new Scanner(System.in);
        int ele = 1;
       
        
        while(ele <= 3){
            
        System.out.println("Elige piedra papel o tijera.");
        System.out.println("Numeros validos del 1 al 3");
            
            System.out.print("Cual es tu eleccion:");
            ele = cap.nextInt();
            
            if (ele == 1){
                System.out.println("Seleccionaeste piedra");
                System.out.println();
       
                System.out.println("La pc selecciono" + Math.random());
                
                
                if (ele == 1 && Math.random() == 1){
                    System.out.println("Has empatado");
                }else if (ele == 1 && Math.random() == 2){
                    System.out.println("Has ganado");
                }else if (ele == 1 && Math.random() == 3){
                    System.out.println("Has perdido");
                }
            }
            }
    }
    
}
