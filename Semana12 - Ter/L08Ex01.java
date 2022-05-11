import java.util.Scanner;

public class L08Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor");
        int n = in.nextInt();

        // n determina o tamanho do vetor
        int[] vetor = new int[n];
        int[] saida = new int[n];

        System.out.println("Informe " + n +  " valores");
        for (int i = 0; i < n; i++) {
            vetor[i] = in.nextInt();
            saida[n-1-i] = vetor[i];
        }
    
        System.out.println("Percorrendo na ordem inversa");
        for(int i = n-1; i >= 0; i--) {
            System.out.print(vetor[i] + "  ");
        }
        System.out.println();
    }
}