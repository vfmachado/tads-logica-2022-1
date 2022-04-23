import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inicio, fim, divisor;
        int soma = 0;

        inicio = in.nextInt();
        fim = in.nextInt();
        divisor = in.nextInt();

        while (inicio <= fim) {
            if (inicio % divisor == 0) {
                soma += inicio;
            }
            inicio++;
        }
        System.out.println("SOMA " + soma);

    }
}
