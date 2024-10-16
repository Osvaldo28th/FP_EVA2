/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_7_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        //While --> cuando se puede repetir 0 o mas veces
        // do while ---> cuando se puede repetir una o mas veces
        
        //puedem llegar a repetirse de manera idefinida
        int val = 1;
        while(val <= 10){//while --> mientras sea valido se ejecuta
            System.out.print(val + "-");
        val ++;
        
        }
        System.out.println();
        val = 1;
        do{
         System.out.print(val + "-");
        val ++;
        }while(val <=10);//repetir instrucciones mientras esto se verdad
    }
    
}
