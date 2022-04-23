import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jogo1 = 0, jogo2 = 0, jogo3 = 0;
        int aluno1 = 0, aluno2 = 0, aluno3 = 0;
        
        int quantidade;

        System.out.println("Informe a quantidade de gameplays");
        quantidade = in.nextInt();


        while (quantidade > 0) {
            System.out.println("Resgistrando gameplay");
            quantidade--;

            System.out.println("Informe a matricula e o cod do jogo");
            int matricula = in.nextInt();
            int codigo = in.nextInt();

            if (codigo == 1) {
                if (jogo1 == 0) {
                    aluno1 = matricula;
                }
                jogo1++;
            }

            if (codigo == 2) {
                if (jogo2 == 0) {
                    aluno2 = matricula;
                }
                jogo2++;
            }

            if (codigo == 3) {
                if (jogo3 == 0) {
                    aluno3 = matricula;
                }
                jogo3++;
            }

        }

        System.out.println("Primeiro jogador do jogo 1: "  + aluno1);
        System.out.println("Primeiro jogador do jogo 2: "  + aluno2);
        System.out.println("Primeiro jogador do jogo 3: "  + aluno3);

        System.out.println("O JOGO MAIS JOGADO FOI");
        if (jogo1 > jogo2 && jogo1 > jogo3) {
            System.out.println("JOGO 1");
        } else if (jogo2 > jogo1 && jogo2 > jogo3) {
            System.out.println("JOGO 2");
        } else {
            System.out.println("JOGO 3");
        }
    }
}
