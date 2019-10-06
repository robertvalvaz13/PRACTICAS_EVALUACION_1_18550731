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
    //Paso por Valor y Paso por Referencia
    //JAVA SOLO MANEJA EL PASO DE -->VALOR<--
    int iNume = 10;
        System.out.println("Valor " + iNume);
        incrementa(iNume);
        System.out.println("Valor " + iNume);
        //----
        Prueba obj = new Prueba();
        obj.iVal=10;
       System.out.println("Valor " + obj.iVal);
       incrementa2(obj);
       System.out.println("Valor " + obj.iVal);
    }
    public static void incrementa(int iVal){
        iVal++;
       
    }
    public static void incrementa2(Prueba obj){
        obj.iVal++;
        
    }
}
class Prueba{
    int iVal;
    
    
}