import java.util.Scanner;
/*
    - O USUÁRIO DEVE DETERMINAR O TAMANHO DO VETOR
    - DENTRO DE UM LAÇO DE REPETIÇÃO O USUARIO ESCOLHE UMA POSICAO E UM VALOR PARA COLOCAR NO VETOR
    - O VETOR É MOSTRADO NA TELA A CADA ITERAÇÃO DO LAÇO
    - SE O USUÁRIO DIGITAR A POSICAO -1 O PROGRAMA ENCERRA.
    - POSICOES INVALIDAS DEVEM APRESENTAR UMA MSG DE ERRO
    - O VETOR DEVE SER DO TIPO FLOAT
*/
public class Vetores02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Vamos testar vetores...");

        System.out.println("Informe o tamanho: ");
        final int TAMANHO = in.nextInt();
        float[] meuVetor = new float[TAMANHO];

        do {
            System.out.println("MEU VETOR:");
            for (int i = 0; i < TAMANHO; i++) {
                System.out.println("Pos " + i + " => " + meuVetor[i]);
            }
            System.out.println("===========\n");

            System.out.println("Informe uma posicao e um valor");
            int pos = in.nextInt();
            if (pos == -1) {
                break;
            }
            if (pos >= 0 && pos < TAMANHO) {
                float valor = in.nextFloat();
                meuVetor[pos] = valor;
            } else {
                System.out.println("POSICAO INVALIDA");
            }

        } while (true);

        System.out.println("FINAL DO PROGRAMA");
    }
}
