package eva1_7_CAPTURA_AUTO;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */
public class EVA1_7_CAPTURA_AUTO {
    public static void main(String[] args) {
        String marca;
        String modelo;
        int year; 
        double precio;
        
        Scanner auto;
        auto=new Scanner(System.in);
        
        System.out.println("Marca deseado");
        marca=auto.nextLine();
        System.out.println("Modelo deseado");
        modelo=auto.nextLine();
        System.out.println("Año del modelo");
        year=auto.nextInt();
        System.out.println("Precio final");
        precio=auto.nextInt();
        
        System.out.println("La marca es: " + marca);
        System.out.println("El modelo es: " + modelo);
        System.out.println("El año es: " + year);
        System.out.println("Su precio final es: " + precio);
    }
    
}