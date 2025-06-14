import java.util.Scanner;

public class SecuenciaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicitar el límite
        System.out.print("Ingrese un número entero positivo como límite: ");
        int limite = scanner.nextInt();

        // Variables para generar la secuencia
        int a = 0, b = 1, suma = 0, contador = 0;

        System.out.println("\nSecuencia de Fibonacci hasta " + limite + ":");

        // 2. Generar y mostrar secuencia
        while (a <= limite) {
            System.out.print(a + " ");
            suma += a;
            contador++;

            int siguiente = a + b;
            a = b;
            b = siguiente;
        }

        // 3. Mostrar resultados finales
        System.out.println("\n\nCantidad de números generados: " + contador);
        System.out.println("Suma total de los números: " + suma);

        scanner.close();
    }
}
