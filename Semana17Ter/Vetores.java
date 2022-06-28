import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        int[] vetor = {};

        do {
            System.out.println("informe a opcao");
            op = in.nextInt();

            switch (op) {
                // O USUARIO DETERMINA O TAMANHO DO VETOR
                case 1:
                    // logica
                    System.out.println("informe o tamanho");
                    int tamanho = in.nextInt();
                    vetor = new int[tamanho];
                    break;

                // 2 - VISUALIZAR VETOR
                case 2:
                    System.out.println("Valores do Vetor:");
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + "  ");
                    }
                    System.out.println();
                    break;
                // 3 - COLOCAR UM VALOR EM UMA POSICAO
                case 3:
                    // O USUÁRIO INFORMA A POSICAO
                    System.out.println("Informe a posicao");
                    int posicao = in.nextInt();
                    // O USUARIO INFORMA O VALOR
                    System.out.println("informe o valor");
                    int valor = in.nextInt();
                    // vetor na posicao recebe o valor
                    vetor[posicao] = valor;
                    break;
                
                // 4 - O PROGRAMA DEVE MOSTRAR O MENOR VALOR DO VETOR
                case 4:
                    int menor = vetor[0];   // SALVANDO O PRIMEIRO VALOR COMO POSSIVEL MENOR
                    int posMenor = 0;

                    //VARRENDO O RESTO DO VETOR
                    for (int i = 1; i < vetor.length; i++) {
                        if (vetor[i] < menor) {
                            menor = vetor[i];
                            posMenor = i;
                        }
                    }
                    System.out.println("O menor valor do vetor eh " + menor);
                    System.out.println(" e esta na posicao "  + posMenor);
                    break;
                // 5 - O PROGRAMA DEVE MOSTRAR O MAIOR VALOR DO VETOR
                case 5:
                    int maior = vetor[0];   // SALVANDO O PRIMEIRO VALOR COMO POSSIVEL MAIOR
                    
                    //VARRENDO O RESTO DO VETOR
                    for (int i = 1; i < vetor.length; i++) {
                        if (vetor[i] > maior) {
                            maior = vetor[i];
                        }
                    }
                    System.out.println("O maior valor do vetor eh " + maior);

                    break;
                // 6 - O PROGRAMA DEVE MOSTRAR A MÉDIA DOS VALORES DO VETOR
                case 6:
                    float soma = 0;
                    for (int i = 0; i < vetor.length; i++) {
                        soma = soma + vetor[i];
                    }
                    float media = soma/vetor.length;
                    System.out.println("A media dos valores do vetor eh " + media);
                    break;
                    
                // 7 - O PROGRAMA PEDE DUAS POSICOES PARA O USUARIO E TROCA OS VALORES DESTA POSICAO
                case 7:
                    System.out.println("informe as duas posicoes");
                    int a = in.nextInt();
                    int b = in.nextInt();
                    
                    int c = vetor[a];
                    vetor[a] = vetor[b];
                    vetor[b] = c;
                    break;
            }

        } while (op != 9);

    }
}