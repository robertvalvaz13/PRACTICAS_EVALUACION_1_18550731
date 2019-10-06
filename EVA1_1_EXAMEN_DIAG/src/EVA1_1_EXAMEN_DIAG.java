/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class EVA1_1_EXAMEN_DIAG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(generaclave());
        //Algo obj = new Algo();
    }
    public static String generaclave(){
     int iVal;
    iVal=(int)(Math.random()*10000);
    String resu="";
    if(iVal<10){//Necesita 3 ceros 000
   resu="000"+iVal;
    }else if(iVal<100){//Necesita 2 ceros 00
    resu="00"+iVal;
            
    }else if(iVal<1000){
       resu="0"+iVal; 
    }else{
     resu=""+iVal;   
    }
    return resu;
        
}
    
}
abstract class algo{}