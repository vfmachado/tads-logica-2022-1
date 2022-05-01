import java.util.Scanner;

public class Vetores01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // DECLARACAO - eu vou ter uma variavel chamada
        // vetor que irá ser um array, ou seja,
        // guardar multiplos valores.
        int[] vetor;
        int vetor2[];

        int [] a, b, c; // todos sao vetores
        int d, e, f[];  // apenas f eh vetor

        // INICIALIZAÇÃO - determinamos quantos valores podem ser armazenados neste vetor!
        vetor = new int[6];

        // declaracao + inicialização com valores determinados
        int[] vetor3 = {1, 2, 3, 4};
        int[] vetor4 = new int[10];

        vetor[0] = 7;
        vetor[1] = 4;
        vetor[2] = 8;
        vetor[3] = 5;
        vetor[4] = 1;
        vetor[5] = 13;

        // NAO DA PARA FAZER...
        System.out.println(vetor);

        System.out.println(vetor[0]);
        System.out.println(vetor[1]);
        System.out.println(vetor[2]);
        System.out.println(vetor[3]);
        System.out.println(vetor[4]);
        System.out.println(vetor[5]);


        int pos = 0;
        while (pos < vetor.length) {
            System.out.println(vetor[pos]);
            pos++;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}