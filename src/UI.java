package src;
import java.util.Scanner;

public class UI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Mostrar menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            
            if (opcion >= 1 && opcion <= 3) {
                // Leer dos números
                System.out.print("Ingrese el primer número: ");
                int num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = scanner.nextInt();
                
                switch (opcion) {
                    case 1:

                        // CAMBIO PARA MOSTRAR CONFLICTO ESTUDIANTE 2
                        System.out.println("Resultado Suma: " + Calc.suma(num1, num2));

                        break;
                    case 2:
                        System.out.println("Resta: " + Calc.resta(num1, num2));
                        break;
                    case 3:
                        System.out.println("Multiplicación: " + Calc.multiplicacion(num1, num2));
                        break;
                }
            } else if (opcion != 4) {
                System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 4);
        
        System.out.println("Saliendo del menú. ¡Hasta luego!");
        scanner.close();
    }
}


