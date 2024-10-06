package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA1_18_RANGOS {
  
    public static void main(String[] args) {
        int califa;
        
        Scanner cap;
        
        cap=new Scanner(System.in);
        
        System.out.println("Ingresa calificacion");
        califa=cap.nextInt();
        
        if(califa>=0 && califa<=100){
            System.out.println("Calificacion valida");
        }else{
            System.out.println("Calificacion no valida");
        }
        
    }
    
}
