import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int[][] m = {
            {8, 0, 7, 1, 2},
            {4, 5, 6, 3, 4},
            {3, 2, 2, 4, 5},
            {3, 1, 2, 5, 2},
            {3, 4, 2, 0, 1}
        };

        Scanner in = new Scanner(System.in);
        int somaBusca;
        do {
            somaBusca = in.nextInt();
            boolean encontrado = false;

            for (int i = 0; i < m.length; i++) {
                int somaLinha = 0;
                for (int j = 0; j < m.length; j++) {
                    somaLinha += m[i][j];
                }
                if (somaLinha == somaBusca) {
                   encontrado = true;
                   System.out.println("LINHA " + i);
               }
            }

            if (!encontrado) System.out.println("Nenhuma linha soma o valor informado.");

        } while (somaBusca != 0);
    }
}
