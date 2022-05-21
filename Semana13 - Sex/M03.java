import java.util.Scanner;

public class M03 {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }

        if (args.length == 0) {
            System.out.println("VC DEVE INFORMAR O TAMANHO COMO PARAMETRO DO PROGRAMA.");
            System.exit(0);
        }

        Scanner in = new Scanner(System.in);
        int TAMANHO = Integer.parseInt(args[0]);
        int posx = TAMANHO/2;
        int posy = TAMANHO/2;

        int[][] mapa = new int [TAMANHO][TAMANHO];

        while (true) {
            for (int i = 0; i < mapa.length; i++) {
                for (int j = 0; j < mapa[i].length; j++) {
                    if (i == posy && j == posx)
                        System.out.print("X  ");
                    else
                        System.out.print(mapa[i][j] + "  ");
                }
                System.out.println();
            }

            char escolha = in.next().charAt(0);
            if (escolha == 'w' && posy > 0) {
                posy -= 1;
            }
            if (escolha == 's' && posy < TAMANHO-1) {
                posy += 1;
            }

            if (escolha == 'a' && posx > 0) {
                posx -= 1;
            }
            if (escolha == 'd' && posx < TAMANHO-1) {
                posx += 1;
            }
        }  

    }
}
