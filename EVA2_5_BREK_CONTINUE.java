/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_brek_continue;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_BREK_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //BREAK ---> TERMINA EL CICLO COMPLETAMENTE
        //CONTINUE --> interrumpe la repeticin actual
        
        for (int i = 1; i <=10; i++){
            if (i == 8)
            break;
            System.out.print(i + "-");
        
        }
        System.out.println();
        for (int i = 1; i <=10; i++){
            if (i == 8)
            continue;
            System.out.print(i + "-");
        
        }
        
    }
    
}
