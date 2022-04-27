import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1. op um\n2. op dois\n3. op tres\n4. op quatro");
        int opcao = in.nextInt();
        /*
         * if (opcao == 1) {
         * System.out.println("o usuario escolheu a primeira opcao");
         * } else if (opcao == 2) {
         * System.out.println("Esta é a segunda opcao");
         * } else if (opcao == 3) {
         * System.out.println("Agora a terceira");
         * } else if (opcao == 4) {
         * System.out.println("Finalmente a quarta");
         * }
         */

        switch (opcao) {
            case 1:
                System.out.println("o usuario escolheu a primeira opcao");
                break;
            case 2:
                System.out.println("Segunda opcao / caso");
                break;
            case 3: 
                System.out.println("Terceiro caso");
                System.out.println("Cada case eh um bloco");
                break;
            case 4: System.out.println("pode ser do lado, apesar de estranho"); break;

            // ultimo caso, nao precisa de break
            default: 
                System.out.println("Input invalido, selecionde um valor de 1 a 4");

        }
    }
}