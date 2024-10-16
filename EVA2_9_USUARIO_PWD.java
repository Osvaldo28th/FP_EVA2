/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_9_USUARIO_PWD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cap = new Scanner(System.in);
        String us, pa;
        final String US = "admin";
        final String PA = "1234";
        
      
        
        do{
        System.out.print("Nombre de usuario:");
        us = cap.nextLine();
        
        System.out.print("Escribe tu contraseña:");
        pa = cap.nextLine();
        
        }while (!us.contentEquals(US) && !pa.contentEquals(PA));
        System.out.println("Bienvenido!!");
    }
    
}
