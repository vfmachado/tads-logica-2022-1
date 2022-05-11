import java.util.Scanner;

public class VetorDeNumeros {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numeros = new int[n];

        String palavra = in.next();

        for (int i = 0; i < n; i++) {
            numeros[i] = (int) palavra.charAt(i); // palavra[i]
        }
    }
}
