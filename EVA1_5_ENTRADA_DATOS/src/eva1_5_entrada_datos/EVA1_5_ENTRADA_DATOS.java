package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @Diana Sanchez
 */

public class EVA1_5_ENTRADA_DATOS {
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre;
        
        //Captura del teclado
        //Scanner --> herramienta (clase)
        //Es un tipo de dato
        
        Scanner cap; //importar la herramienta
        //Se importa
        
        cap=new Scanner(System.in);//Creamos la herramienta
        
        //Instrucciones
        
        System.out.println("Ingresa tu nombre");
        //Capturar
        nombre=cap.nextLine();
        System.out.println("Hola " + nombre);
        
    }
    
}
