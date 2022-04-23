import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int primeiroValor;
        int novoValor = -1;

        primeiroValor = in.nextInt();

        while (novoValor != 0) {
            novoValor = in.nextInt();

            if (novoValor != 0)
            if (novoValor % primeiroValor == 0) {
                System.out.println("MULTIPLO DO ANTERIOR");
            } else if (primeiroValor % novoValor == 0) {
                System.out.println("DIVISOR DO ANTERIOR");
            } else {
                System.out.println("NAO TEM RELACAO");
            }

            primeiroValor = novoValor;
        }

    }
}
