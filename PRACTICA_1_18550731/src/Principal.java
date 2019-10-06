
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner e = new Scanner(System.in);
        int x;
        int suma = 0;
        double media;
        
        
        System.out.println("Numero de edades a capturar:");
        x = e.nextInt();
        int Edades[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Ingrese la edad:");   
            Edades[i] = e.nextInt();
            suma  = suma + Edades[i];
            
        }
        media = (double)suma/x;
        System.out.println("La media es: " + media);
         double moda =0;
         int MaxRepe= 0;
         for (int i = 0; i < Edades.length; i++) {
          int Repe= 0;
             for (int j = 0; j < Edades.length; j++) {
              if(Edades[i]== Edades[j])
                  Repe++;
              if(Repe>MaxRepe){
              moda = Edades[i];
              MaxRepe= Repe;
              }
             }
        }
         System.out.println("La moda es: " + moda );
         double Num = 0;
         for (int i = 0; i < Edades.length; i++) {
             double Res = Edades[i]- media;
             Num+= (Math.pow(Res, 2));
                                                        
        }
         double De = Math.pow((Num/x),0.5);
         System.out.println("La desviación estándar es: " + De);
    }
}
