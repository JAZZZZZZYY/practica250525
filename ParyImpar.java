import java.util.Scanner;

public class ParyImpar {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        int pares = 0;
        int impares = 0;
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostramos la cantidad de pares e impares
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        sc.close();
    }
}
