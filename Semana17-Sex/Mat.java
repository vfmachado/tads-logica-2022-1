import java.util.Scanner;

public class Mat {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[][] M = new int[8][8];

    do {
      for (int i = 0; i < M.length; i++) {
        for (int j = 0; j < M[i].length; j++) {
          System.out.print(M[i][j] + "  ");
        }
        System.out.println();
      }

      System.out.println("\nO que quer fazer agora? \n" +
          "1. Colocar um valor\n" +
          "2. Trocar duas LINHAS\n" + 
          "3. Menor valor");
      
      // TRANSFORMAR EM SWITCH CASE
      // MENOR VALOR
      // MAIOR VALOR
      // LINHA COM A MAIOR SOMA
      // COLUNA COM A MAIOR SOMA
      // BUSCAR POSICOES EM QUE TEM DETERMINADO VALOR
      // QUAL DAS DIAGONAIS TEM A MAIOR SOMA
      // QUANTOS VALORES DA MATRIZ SAO PARES
      // QUANTOS VALORES DA MATRIZ SAO MULTIPLOS DE UM DETERMINADO NUMERO
      // FORCAR O PREENCHIMENTO COM RANDOM SEM REPETICAO
      // NAO PERMITIR A INSERCAO DE UM VALOR QUE JA EXISTE
      // ZERAR A MATRIZ COM UM NOVO TAMANHO

      int op = in.nextInt();
      
      if (op == 1) {
        System.out.println("Informe a linha, coluna e o valor");
        int linha = in.nextInt();
        int coluna = in.nextInt();
        int valor = in.nextInt();
        M[linha][coluna] = valor;
      }

      if (op == 2) {
        System.out.println("Informe duas linhas");
        int linhaA = in.nextInt();
        int linhaB = in.nextInt();

        // percorrer todas as colunas
        for (int j = 0; j < M.length; j++) {
          int aux = M[linhaA][j];
          M[linhaA][j] = M[linhaB][j];
          M[linhaB][j] = aux;
        }
      }

      if (op == 3) {
        // FAZER A LOGICA PARA PERCORRER TODA A MATRIZ E BUSCAR O MENOR VALOR
        
      }

    } while (true);
  }
}
