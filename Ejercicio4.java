import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Inicializamos mayor y menor con el primer elemento
        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscamos el mayor y el menor valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostramos los resultados
        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);

        sc.close();
    }
}
