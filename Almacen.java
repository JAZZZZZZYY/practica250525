import java.util.Scanner;

public class Almacen {
    public static void main(String[] args) {
        // Creamos un vector para almacenar 10 nombres de frutas
        String[] frutas = new String[10];
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario que ingrese los nombres de las frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese el nombre de la fruta #" + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        // Mostramos el contenido del vector en orden inverso
        System.out.println("Frutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        sc.close();
    }
}
