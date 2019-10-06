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
    public static void main(String[] args) {
        int aMatriz[][] = new int[5][5];   
        for (int i = 0; i < aMatriz.length; i++) { //FILAS 0 --> 3
           for (int j = 0; j < aMatriz[i].length; j++) {
            aMatriz[i][j] =(int)(Math.random()*100);            
            }                
        }
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz[i].length; j++) {
            System.out.print("[" + aMatriz[i][j] + "]");     
            }        
            System.out.println("");
        }
       int aCopia[][]= new int [5][5];
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz.length; j++) {
                aCopia[i][j]= aMatriz[aMatriz[i].length-(i+1)][aMatriz[j].length-(j+1)];
            }
    
        }
        System.out.println("Copia");
        for (int i = 0; i < aMatriz.length; i++) {
            for (int j = 0; j < aMatriz.length; j++) {
                System.out.print("[" + aCopia[i][j] + "]");  
            }
            System.out.println("");
        }
        }
    }
        

