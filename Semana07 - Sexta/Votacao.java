import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int votosA = 0, votosB = 0, votosC = 0;
        
        System.out.println("VC DESEJA SER UMA PESSOA 1 - FULLSTACK, 2 - BACKEND, 3 - FRONTEND");
        
        int votoAtual = -1;

        while (votoAtual != 0) {
            System.out.println("OPCAO DESEJADA");
            votoAtual = in.nextInt();

            if (votoAtual == 1)  {
                votosA++;
            }  else if (votoAtual == 2)  {
                votosB++;
            } else if (votoAtual == 3)  {
                votosC++;
            } else {
                System.out.println("OPCAO INVALIDA");
            }

        }

        System.out.println("TOTAIS");
        System.out.println("OPCAO A " + votosA);
        System.out.println("OPCAO B " + votosB);
        System.out.println("OPCAO C " + votosC);

    }
}