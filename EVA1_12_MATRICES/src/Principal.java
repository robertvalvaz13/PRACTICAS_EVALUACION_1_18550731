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
    int aMatriz[][] = new int[3][5];   
    //FOR ANIDADOS
        for (int i = 0; i < aMatriz.length; i++) { //FILAS 0 --> 3
           for (int j = 0; j < aMatriz[i].length; j++) {
            aMatriz[i][j] =(int)(Math.random()*100);
            
            }
    
            
        }
        //IMPRIMIR LA MATRIZ:
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
            System.out.print("[" + aMatriz[i][j] + "]");     
            }
        
            System.out.println("");
        }
        }
        
    
}

