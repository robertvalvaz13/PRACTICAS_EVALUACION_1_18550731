
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez 18550731
 */
public class Principal {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CREAR CLASE PERSONA,Y CREAR UN ARREGLO
        //QUE ALMACENE LAS 10 PERSONAS
        
        Persona[] aPersonas = new Persona[5];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < aPersonas.length; i++) {
        aPersonas[i] =  new Persona();
            System.out.println("Introduce tu nombre:");
        aPersonas[i].nombre= sCaptu.nextLine();
        
            
        }
   imprimeArreglo(aPersonas);
   //COPIA ARREGLO
   Persona[] aCopia = new Persona[aPersonas.length];
   for (int i = 0; i < aPersonas.length; i++) {
        aCopia[i] =  new Persona();
        aCopia[i].nombre  = aPersonas[i].nombre;
        }
    }
    public static void imprimeArreglo(Persona[]args){
    for (int i = 0; i < args.length; i++) {
        System.out.println("Nombre: " + args[i].nombre);        
        }
    
    }
}
class Persona{
    String nombre;
}