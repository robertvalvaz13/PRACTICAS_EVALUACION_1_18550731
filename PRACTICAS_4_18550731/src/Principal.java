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
    double [][] Matriz1 = new double [5][5], Matriz2 = new double[5][5], MatrizMulti = new double[5][5];
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz2.length; j++) {
                Matriz1[i][j]= (Math.random()*10+1);
                Matriz2[i][j]= (Math.random()*10+1);
                MatrizMulti[i][j]= (Matriz1[i][j]*Matriz2[i][j]);                                            
            }
            
        }
        System.out.println("Matriz 1"); 
        ImprimirMatriz(Matriz1);
        System.out.println("Matriz 2"); 
        ImprimirMatriz(Matriz2);
        System.out.println("Matriz Multiplicación"); 
        ImprimirMatriz(MatrizMulti);
    }
    public static void ImprimirMatriz(double[][] r){
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
           System.out.print("[" + r[i][j] + "]");      
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
