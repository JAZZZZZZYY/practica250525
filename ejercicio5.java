import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        String[][] articulos = new String[3][3];
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los nombres de los artículos
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el nombre del artículo [" + i + "][" + j + "]: ");
                articulos[i][j] = sc.nextLine();
            }
        }

        // Mostramos la matriz con las filas en orden invertido
        System.out.println("Contenido de la matriz con filas invertidas:");
        for (int i = 2; i >= 0; i--) {
            for (int j = 0; j < 3; j++) {
                System.out.print(articulos[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
