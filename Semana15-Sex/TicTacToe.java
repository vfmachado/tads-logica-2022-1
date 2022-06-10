import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jogador = 1;
        int[][] M = new int[3][3];
        boolean acabou = false;

        while (!acabou) {

            for (int i = 0; i < M.length; i++) {
                for (int j = 0; j < M.length; j++) {
                    System.out.print(M[i][j] + "  ");
                }
                System.out.println();
            }
            System.out.println("PLAYER " + jogador + " ... Informe uma linha e uma coluna");
            int linha = in.nextInt();
            int coluna = in.nextInt();

            // System.out.println("informe um valor de 0 a 8");
            // int linha = valor/3
            // int coluna = valor%3

            M[linha][coluna] = jogador;

            for (int i = 0; i < 3; i++) {
                if (M[i][0] == M[i][1] && M[i][0] == M[i][2] && M[i][0] != 0) {
                    System.out.println("PLAYER "+ jogador + " GANHOU!!");
                    acabou = true;
                }

                if (M[0][i] == M[1][i] && M[0][i] == M[2][i] && M[0][i] != 0) {
                    System.out.println("PLAYER "+ jogador + " GANHOU!!");
                    acabou = true;
                }
            }

            // verificar as diagonais
            if (M[0][0] == M[1][1] && M[0][0] == M[2][2] && M[0][0] != 0) {
                System.out.println("PLAYER "+ jogador + " GANHOU!!");
                acabou = true;
            }

            if (M[0][2] == M[1][1] && M[1][1] == M[2][0] && M[0][2] != 0) {
                System.out.println("PLAYER "+ jogador + " GANHOU!!");
                acabou = true;
            }

            if (jogador == 1) {
                jogador = 2;
            } else {
                jogador = 1;
            }
        }

    }
}