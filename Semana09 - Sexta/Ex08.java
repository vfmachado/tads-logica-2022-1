import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcao = 0;
        String lista = "";
        int maior = -999999999;
        int menor =  999999999;

        while (opcao != 5) {
            System.out.println("Menu de opcoes:");
            System.out.println("1. Inserir valor");
            System.out.println("2. Consultar Maior");
            System.out.println("3. Consultar Menor");
            System.out.println("4. Listar Valores");
            System.out.println("5. Encerrar");

            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Informe o valor");
                int valor = in.nextInt();

                lista += valor + "\t";

                if (valor < menor) {
                    menor = valor;
                }

                if (valor > maior) {
                    maior = valor;
                }
            } else if ( opcao == 2) {
                System.out.println("MAIOR VALOR: " + maior);
            } else if ( opcao == 3) {
                System.out.println("MENOR VALOR: " + menor);
            } else if (opcao == 4) {
                System.out.println(lista);
            }
        }

    }
}
