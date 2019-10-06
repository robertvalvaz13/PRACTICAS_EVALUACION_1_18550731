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
        int aMatriz[][] = new int[100][100];    
        for (int i = 0; i < aMatriz.length; i++) { //FILAS 0 --> 3
           for (int j = 0; j < aMatriz[i].length; j++) {
               if (i==j) {
               aMatriz[i][j]=1;
               }
               else  {
                      aMatriz[i][j]=0;  
                       }
                   System.out.print("[" + aMatriz[i][j] + "]");
               }
               System.out.println("");
            }
         
         
        }
    
    }
    

