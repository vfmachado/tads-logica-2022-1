import java.util.Scanner;

public class Matrizes {
  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    
    int dado = 5;
    int[] vetorDados = { 7, 2, 4, 1, 5, -1, 0, 5, 7, 1, 0};
    int[][] matrizDados = new int[10][8];

    System.out.println("Dado unico");
    System.out.println(dado);

    System.out.println("\nVetor de dados");
    System.out.println(vetorDados); // nao funciona como gostariamos
    for (int i = 0; i < vetorDados.length; i++) {
      System.out.print(vetorDados[i] + "  ");  // i é a posicao que queremos acessar
    }
    System.out.println();

    System.out.println("\nMatriz bi-dimensional");
    System.out.println(matrizDados);
    for (int i = 0; i < matrizDados.length; i++) {
      for (int j = 0; j < matrizDados[i].length; j++) {
        System.out.print(matrizDados[i][j] + "  ");
      }
      System.out.println();
    }

    System.out.println("\n\n");

    // EXEMPLO - COMPARAR DOIS VALORES, INDICANDO O MENOR DELES
    int a, b;
    a = 5; 
    b = 8;
    int menor = a;
    if (b < a)  { // true ou false
      menor = b;
    } 
    System.out.println("Menor: " + menor);
    System.out.println();

    // UTILIZAR A MESMA LOGICA PARA UM VETOR OU UMA MATRIZ
    int mVetor = vetorDados[0];
    // PARA (INICIALIZACAO; CONDICAO; PASSO ou INCREMENTO) FAÇA
    // COM O I COMEÇANDO EM (INICIALIZACAO), ENQUANTO ELE FOR MENOR QUE (CONDICAO), FAÇA (BLOCO DE CODIGO) .. DEPOIS QUE O BLOCO É EXECUTADO, EXECUTA O PASSO(INCREMENTO) ... VOLTA A CONDIÇÃO, E REPETE ENQUANTO FOR VERDADEIRO
    for (int i = 1; i < vetorDados.length; i++) {
                        // eh mesmo que o tamanho do meu vetor
                        // i < 11
      if (vetorDados[i] <  mVetor) {
        mVetor = vetorDados[i];
      }
    }
    
    System.out.println("O menor valor do vetor eh " + mVetor);


    System.out.println();
    System.out.println("... em uma matriz");

    for (int i = 0; i < matrizDados.length; i++) {
      
      System.out.println("Acessando a linha " + i);

      for (int j = 0; j < matrizDados[i].length; j++) {
        System.out.println("\tAcessando a coluna " + j + ": " + matrizDados[i][j]);
      }

    }

    // soma os elementos da mesma linha
    int busca = 14;
    for (int i = 0; i < matrizDados.length; i++) {
      
      System.out.println("Acessando a linha " + i);
      int soma = 0;
      for (int j = 0; j < matrizDados[i].length; j++) {
        soma += matrizDados[i][j];  // soma = soma + matrizDados[i][j];
      }
      System.out.println("\tNessa linha a soma totalizou " + soma);
      if (soma == busca) {
        System.out.println("ESSE RESULTADO EH O MESMO BUSCADO..");
      }
    }


    System.out.println("\n\n");

    // dado uma linha, colocar todos os valores desta linha igual a 5;
    int linha = 2;
    for (int j = 0; j < matrizDados[linha].length; j++) {
      matrizDados[linha][j] = 5;
    }

    for (int i = 0; i < matrizDados.length; i++) {
      for (int j = 0; j < matrizDados[i].length; j++) {
        System.out.print(matrizDados[i][j] + "  ");
      }
      System.out.println();
    }

    System.out.println("\n\n");

    // ALTERAR TODOS OS VALORES EM QUE A SOMA DA LINHA E DA COLUNA SEJA UM NUMERO MULTIPLO DE 3, PARA O VALOR DA SOMA
    for (int i = 0; i < matrizDados.length; i++) {
      
      System.out.println("Acessando a linha " + i);

      for (int j = 0; j < matrizDados[i].length; j++) {
        System.out.println("\tAcessando a coluna " + j + " a soma resulta em  " + (i + j));
        if ( (i + j) % 3 == 0) {
          matrizDados[i][j] = i + j;
        }
      }

    }

    for (int i = 0; i < matrizDados.length; i++) {
      for (int j = 0; j < matrizDados[i].length; j++) {
        System.out.print(matrizDados[i][j] + "  ");
      }
      System.out.println();
    }

    System.out.println("\n\n");
  }
}