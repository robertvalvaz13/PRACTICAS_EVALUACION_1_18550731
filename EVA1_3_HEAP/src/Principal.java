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
    public static void main(String[] args) {   //stack
    int i =10;                                 //stack
    Principal pObj= new Principal();           //heap
        System.out.println(i);                 //stack
        System.out.println(pObj);              //stack
        pObj = null;  //NOS DESHACEMOS DE LA MEMORIA USADA
    }
    
}
