import java.util.Scanner;

public class MultiplosEntreIntervalo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inicio, fim;

        System.out.println("Determine o valor de inicio e fim do intervalo");
        inicio = in.nextInt();
        fim = in.nextInt();

        System.out.println("Dentro desse intevalo, vc procura os multiplos de quanto?");
        int divisor = in.nextInt();
        int quantMultiplos = 0;
        int valor = inicio;
        while (valor <= fim) {
            // encontrou um valor multiplo de divisor
            if (valor % divisor == 0) {
                System.out.println(valor);
                quantMultiplos++;
            }
            valor = valor + 1;
        }

        System.out.println("Quantidade total de multiplos " + quantMultiplos);
    }  
}
