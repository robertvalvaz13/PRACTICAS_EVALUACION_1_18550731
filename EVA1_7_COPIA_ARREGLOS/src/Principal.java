/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Valdez Vazquez 18850731
 */
public class Principal {
    public static void main(String[] args) {
        int aiDatos[]=new int[10];
        int aiCopia[]=new int[10];
        System.out.println("Datos originales");
        for (int i = 0; i < aiDatos.length; i++) {
             aiDatos[i]=(int)(Math.random()*100)+1;
        }
        for (int i = 0; i < aiDatos.length; i++) {
             System.out.println("["+aiDatos[i]+"]");
        }
        aiCopia=aiDatos;
        System.out.println(aiCopia);
        System.out.println(aiDatos);
        System.out.println("Datos copiados");
        for (int i = 0; i < aiCopia.length; i++) {
             System.out.println("["+aiCopia[i]+"]");
            
        }
    }
}