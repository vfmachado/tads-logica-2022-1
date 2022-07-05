public class Matrizes {
  public static void main(String[] args) {
    
    /*
     * DADA UMA MATRIZ DE TAMANHO 4 X 4 (QUADRADA)
     * 
     * E UM VETOR TAMANHO DE TAMANHO 4,
     * 
     * VERIFICAR SE ALGUMA DAS LINHAS. COLUNAS OU DIAGONAIS DA MATRIZ É EQUIVALENTE AOS VALORES DO VETOR, 
     * 
     * ** OBS: NOTEM QUE ESTE MESMO PROBLEMA PODE SER FACILMENTE TRANSFORMADO EM MATRIZ NxN e vetor de tamanho N
     */

     /*
      * 

      M
        c
        v
      1 1 3 5
      1 2 3 4   -> linha 1
      1 3 3 2
      2 4 3 4
              dig principal
      
      v = 1 2 3 4

      */

      int [][] m = {
        {3, 3, 3, 3},
        {1, 2, 3, 4},
        {1, 3, 3, 2},
        {2, 4, 3, 4}
      };

      /*  <3 PROCURAR LINHAS IGUAIS EM UMA MATRIZ <3  */

      int [] v = { 3, 3, 3, 3};

      for (int i = 0; i < v.length; i++) {  // passa por todas linhas
        System.out.println("Linha " + i);
        boolean iguais = true;

        for (int j = 0; j < v.length; j++) {  // passa por todas colunas
          System.out.print(m[i][j] + "  ");
          if (v[j] != m[i][j]) {
            iguais = false;
          }
        }

        // passei por toda linha..
        if (iguais) {
          System.out.println("Linha " + i + " eh igual!!!");
        }

        System.out.println();
      }

      System.out.println();

      // com i representando a coluna
      for (int i = 0; i < v.length; i++) {
        System.out.println("Coluna " + i);
        boolean iguais = true;
        for (int j = 0; j < v.length; j++) {
          System.out.print(m[j][i] + "  ");
          if (v[j] != m[j][i]) {
            iguais = false;
          }
        }
        if (iguais) {
          System.out.println("Coluna " + i + " eh igual!!!");
        }
        System.out.println();
      }

      System.out.println("Diagonal principal: ");
      // diagonal principal
      boolean dprincipal = true;
      for (int i = 0; i < v.length; i++) {
        System.out.println(m[i][i]);
        if (v[i] != m[i][i]) {
          dprincipal = false;
        }
      }

      if (dprincipal) { 
        System.out.println("Diagonal principal eh igual");
      }


      System.out.println("Diagonal secundaria: ");
      // diagonal principal
      for (int i = 0; i < v.length; i++) {
        System.out.println(m[i][v.length-1-i]);
      }


  }
}
