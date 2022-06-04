import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mat[][] = new int[5][5];
        Random aleat = new Random();

        System.out.println("MATRIZ ALEATORIA:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = aleat.nextInt(10);
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        while (true) {
            System.out.println("Informe uma linha e coluna");
            int lin = in.nextInt();
            int col = in.nextInt();

            if (lin < 0 || lin > 4 || col < 0 || col > 4) {
                System.out.println("valor invalido, encerrando programa");
                break;
            }

            int soma = 0;
            for (int i = 0; i < mat.length; i++) {
                soma = soma + mat[lin][i];
                soma = soma + mat[i][col];
            }

            soma = soma - mat[lin][col];
            System.out.println("A soma dos elementos é " + soma);
        }
    }
}
