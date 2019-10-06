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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //ARREGLOS
    //DECLARACION DE ARREGLOS 
    int aiDatos[]= new int [10];
        //N--> #NUMERO DE ELEMENTOS
        //0 --> 1ER ELEMENTO
        //N-1--> ÚLTIMO ELEMENTO
        System.out.println(aiDatos);
        for (int i = 0; i < aiDatos.length; i++) {
        aiDatos[i] = (int)(Math.random()*100)+1;
           
        }
        System.out.println("FOR NORMAL");
         for (int i = 0; i < aiDatos.length; i++){
             System.out.println(aiDatos[i]);
        }
         System.out.println("FOR EACH ");
         for (int aiDato : aiDatos) {
             System.out.println(aiDato);   
        }
            
        }
    }
    

