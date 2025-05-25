import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        // Creamos un vector para almacenar 12 números enteros
        int[] numeros = new int[12];
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        // Pedimos al usuario que ingrese los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        // Calculamos el promedio
        double promedio = (double) suma / numeros.length;

        // Mostramos el promedio
        System.out.println("El promedio de los números ingresados es: " + promedio);

        sc.close();
    }
}
