package proyecto_java;
import java.util.Scanner; // Clase Importada

public class Ejemplo02 {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        // Declaración de Variables 
        double usd, europa, reinoUnido, australia, canada, moneda, conver1, conver2, conver3, conver4, conver5;
        // Valores Prederteminados
        usd = 1;
        europa = 0.70;
        reinoUnido = 0.61;
        australia = 0.95;
        canada = 0.97;
        // Inicialización de Variables
        System.out.println("Ingrese valor monetario: ");
        moneda = leer.nextDouble();
        
        conver1 = moneda * usd;
        conver2 = moneda * europa; 
        conver3 = moneda * reinoUnido;
        conver4 = moneda * australia;
        conver5 = moneda * canada;
        
        System.out.println("En USD el valor es de: "+conver1);
        System.out.println("En Europa el valor es de: "+conver2);
        System.out.println("En El Reino Unido el valor es de "+conver3);
        System.out.println("En Australia el valor es de: "+conver4);
        System.out.println("En Canada el valor es de: "+conver5);
    }
}
