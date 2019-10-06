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
    Prueba[]apArreglo = new Prueba[5];
    Prueba[] apCopia = new Prueba[5];   
       System.out.println(apArreglo);

        for (int i = 0; i < apArreglo.length; i++) 
        {
         apArreglo[i] = new Prueba();
         apArreglo[i].x = (int)(Math.random()*100);
            System.out.println(apArreglo[i]);
        }
        for (int i = 0; i < apArreglo.length; i++) {
             apCopia[i] = new Prueba(); 
           
            System.out.println("Copia" + i + " = " + apCopia[i]);
             System.out.println("Arreglo" + i + " = " + apArreglo[i]);

        }
    }
    
}
 class Prueba{int x;};