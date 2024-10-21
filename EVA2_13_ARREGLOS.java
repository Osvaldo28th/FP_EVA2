/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_arreglos;

/**
 *
 * @author Osvaldo Chavez
 */
public class EVA2_13_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO:
        // ESTRUCTURA DE DATOS (TDA)
        //TDA --> Tipos de datos abstractos
        //Onjetos (new)
       //Almacena un conjunto de elementos
       //Del mismo tipo
       //Espacio de memoriacontiuga
       //Acceso por indices --> acceso aleatorio
       //int[] --> infica que es un arreglo en enteros
       //new int[] --> crea el espacio para 10 enteros
       int [] arreglo = new int [10];
       //Primer elemento --> 0
      // Ultimo elemento --> tamaño -1 = 10 -1 = 9
      arreglo[0] = 100;//ponemos 100 en el entero de la posicion cero
      arreglo[9] = 900;  //Ultima posicion (10-1)
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        System.out.println(arreglo[6]);
        System.out.println(arreglo[7]);
        System.out.println(arreglo[8]);
        System.out.println(arreglo[9]);
    }
    
}
