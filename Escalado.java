package Act3GITAntoniorRuizMartin;
import java.util.Scanner;
public class Escalado {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar los dos números al usuario
	        System.out.print("Introduce el primer número: ");
	        int numeroInicio = scanner.nextInt();

	        System.out.print("Introduce el segundo número: ");
	        int numeroFin = scanner.nextInt();

	        // Determinar el menor y mayor entre los números
	        int inicio = Math.min(numeroInicio, numeroFin);
	        int fin = Math.max(numeroInicio, numeroFin);

	        System.out.println("\nNúmeros comprendidos entre " + inicio + " y " + fin + " incrementando de 7 en 7:");
	        
	        // Generar los números con un incremento de 7
	        for (int i = inicio; i <= fin; i += 7) {
	            System.out.println(i);
	        }

	        scanner.close();
	    }
	}
