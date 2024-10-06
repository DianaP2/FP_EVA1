package eva1_14_califas;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_14_CALIFAS {

    public static void main(String[] args) {
        int cali;
        Scanner cap = new Scanner(System.in);
        
        System.out.println("Ingresa tu calificacion");
        cali=cap.nextInt();
        
        if(cali>=70){
            System.out.println("Acreditado");
        }else{
            System.out.println("N/A");
        }
    }
    
}
