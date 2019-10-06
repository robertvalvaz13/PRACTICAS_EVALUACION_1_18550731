/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez 18550731
 */
public class Principal {
    
    public static void main(String[] args) {
        
      int Matriz[] = new int[10];  
        System.out.println(Matriz);
       LlenarArreglo(Matriz); 
       MadrearArreglo(Matriz);
        System.out.println(Matriz);   
       ImprimirArreglo(Matriz);       
        } 
       public static void LlenarArreglo(int[]Array){
       for (int i = 0; i < Array.length; i++) {          
            Array[i] =(int)(Math.random()*100);            
            }  
           System.out.println(Array);
       }  
       public static void MadrearArreglo(int[]Array){
       Array = new int[100];
           System.out.println(Array);
       }
        public static void ImprimirArreglo(int[]Array){
       for (int i = 0; i < Array.length; i++) {          
            System.out.println("[" + Array[i] + "]");            
            } 
            System.out.println("");
       }   
    }
    

