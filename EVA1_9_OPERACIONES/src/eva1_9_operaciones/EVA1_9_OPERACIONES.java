package eva1_9_operaciones;

public class EVA1_9_OPERACIONES {

    public static void main(String[] args) {
        // TODO code application logic here
        // OPERACIONES ARITMETICAS
        // Inicializacion de una variable
        
        int x = 10; //Declaracion y aignacion
        int y = 5;
        //Si necesitas muchas variables
        int suma, resta, multi, div, pot, raiz;
        
        //Suma
        
        suma = x + y;
        System.out.println("La suma es: " + suma);
        
        //Resta
        
        resta = x - y;
        System.out.println("La resta es: " + resta);
   
        //Multi
        
        multi = x * y;
        System.out.println("La multiplicacion es: " + multi);
        
        //Div
        
        div = x / y;
        System.out.println("La divi es: " + div);
        
        x = 5;
        y = 2;
        
        div = x / y;
        System.out.println("La div es: " + div);
        
        //Div con numeros con puntos
        
        double val1 = 5;
        double val2 = 2;
        double resu;
        
        resu= val1 / val2;
        System.out.println("La div es: " + resu);
        
    }
    
}
