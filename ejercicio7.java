import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los valores numéricos
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean existePuntoSilla = false;

        // Buscamos puntos de silla
        for (int i = 0; i < filas; i++) {
            // Encontrar el menor valor de la fila i y su columna
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }
            // Verificar si minFila es el mayor en su columna
            boolean esPuntoSilla = true;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][colMin] > minFila) {
                    esPuntoSilla = false;
                    break;
                }
            }
            if (esPuntoSilla) {
                System.out.println("Existe un punto de silla en [" + i + "][" + colMin + "]: " + minFila);
                existePuntoSilla = true;
            }
        }

        if (!existePuntoSilla) {
            System.out.println("No existe ningún punto de silla en la matriz.");
        }

        sc.close();
    }
}
