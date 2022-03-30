import java.util.Scanner;

public class L02Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Informe dois valores");
        a = in.nextInt();
        b = in.nextInt();
        int soma = a + b;

        if (soma > 20) {
            resultado = soma + 8;
        } else {
            resultado = soma - 10;
        }

        System.out.println("RESULTADO " + resultado);
    }
}
