import java.util.Scanner;

public class VelhaVetor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 
        char[] tabuleiro = { '-', '-', '-', '-', '-', '-', '-', '-', '-', };
        int jogador = 1;

        /*

        */
        do {
            //PARTE I
            for (int i = 0; i < 9; i++) {
                System.out.print(tabuleiro[i] + "  ");
                if (i == 2 || i == 5 || i == 8) {
                    System.out.println();
                }
            }

            // PARTE II
            System.out.print("\nEm que posicao vc quer jogar (0-8) JOGADOR@ " + jogador + "? ");
            int posicao = in.nextInt();

            if (jogador == 1) {
                tabuleiro[posicao] = 'x';
                jogador = 2;
            } else {
                tabuleiro[posicao] = 'o';
                jogador = 1;
            }

            // PARTE III
            boolean ganhou = false;
            for (int i = 0; i < 3; i++) {
                if (tabuleiro[3 * i] == tabuleiro[3 * i + 1] &&
                        tabuleiro[3 * i] == tabuleiro[3 * i + 2] &&
                        tabuleiro[3 * i] != '-') {
                    System.out.println(tabuleiro[i] + " GANHOU");
                    ganhou = true;
                }
            }

            for (int i = 0; i < 3; i++) {
                if (tabuleiro[i] == tabuleiro[i + 3] &&
                        tabuleiro[i] == tabuleiro[i + 6] &&
                        tabuleiro[i] != '-') {
                    System.out.println(tabuleiro[i] + " GANHOU");
                    ganhou = true;
                }
            }

            // diagonais
            if (tabuleiro[0] == tabuleiro[4] &&
                    tabuleiro[0] == tabuleiro[8] &&
                    tabuleiro[0] != '-') {
                System.out.println(tabuleiro[0] + " GANHOU");
                ganhou = true;
            }

            if (tabuleiro[2] == tabuleiro[4] &&
                    tabuleiro[2] == tabuleiro[6] &&
                    tabuleiro[2] != '-') {
                System.out.println(tabuleiro[2] + " GANHOU");
                ganhou = true;
            }

            if (ganhou) break;

            // PARTE IV
            boolean temTracinho = false;
            for (int i = 0; i < tabuleiro.length; i++) {
                if (tabuleiro[i] == '-') {
                    temTracinho = true;
                }
            }

            if (!temTracinho) {
                System.out.println("DEU VELHA!!");
                break;
            }
        } while (true);

    }

}
