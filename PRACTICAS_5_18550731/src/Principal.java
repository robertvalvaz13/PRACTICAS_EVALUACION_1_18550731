/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 52614
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int aMatriz[] = new int[50];   
    //FOR ANIDADOS
        for (int i = 0; i < aMatriz.length; i++) { //FILAS 0 --> 3
        aMatriz[i] =(int)(Math.random()*100);
        
              
            if(aMatriz[i]%2==0){
                System.out.println(aMatriz[i]);
                
            }
            
                
            }
    }
    
}
