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
        // TODO code application logic here
        int aMatriz[][] =new int[2][3];
        int aMatriz2[][];
        aMatriz2 = new int[3][];
        aMatriz2[0] = new int [10];
        aMatriz2[1] = new int[100];
        aMatriz2[2] = new int[24];
        for (int i = 0; i < aMatriz2.length; i++) {
            for (int j = 0; j < aMatriz2[i].length; j++) {
                aMatriz2[i][j] = (int)(Math.random()*100);
                System.out.print("[" + aMatriz2[i][j] + "]");
            }
            System.out.println(""); 
        }
    
    }
    
}
