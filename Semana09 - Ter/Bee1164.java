import java.util.Scanner;

public class Bee1164 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testes = in.nextInt();
        int soma;

        while (testes > 0) {
            int numero = in.nextInt();
            int divisor = 1;
            soma = 0;
            while (divisor <= numero/2) {
                System.out.println("verificando se " + numero + " eh divisel por " + divisor);
                if (numero % divisor == 0) {
                    System.out.println("É DIVISOR!!\n");
                    soma = soma + divisor;
                }
                divisor++;
            }

            System.out.println("TOTAL DA SOMA DOS DIVISORES " + soma);

            if (soma == numero) {
                System.out.println(numero + " eh perfeito");
            } else {
                System.out.println(numero + " nao eh perfeito");
            }

            testes--;
        }
    }   
}
