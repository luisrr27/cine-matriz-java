import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int[][] asientos = new int[3][4];

            System.out.print("Ingrese fila (0 a 2): ");
            int f = sc.nextInt();

            System.out.print("Ingrese columna (0 a 3): ");
            int c = sc.nextInt();

            asientos[f][c] = 1;

            System.out.println("Estado de la sala:");

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(asientos[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}