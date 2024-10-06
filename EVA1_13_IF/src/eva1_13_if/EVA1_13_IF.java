package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_13_IF {

    public static void main(String[] args) {
        int edad;
        
        Scanner cap=new Scanner(System.in);
        
        System.out.println("Ingresa edad");
        edad=cap.nextInt();
        
        if(edad>=18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
    
}
