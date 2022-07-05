public class ComparandoLinhas {
  public static void main(String[] args) {
    
      int [][] m = {
        {3, 3, 3, 3},
        {1, 2, 3, 4},
        {1, 3, 3, 2},
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 3, 3, 2},
        {3, 3, 3, 3},
        {1, 2, 3, 4},
        {1, 2, 3, 4},
        {1, 3, 3, 2},
        {1, 2, 3, 4}
      };

      for (int linhas = 0; linhas < m.length; linhas++) {  
        
        for (int outrasLinhas = linhas+1; outrasLinhas < m.length; outrasLinhas++) {
       
          boolean iguais = true;
          for (int colunas = 0; colunas < m[linhas].length; colunas++) {
            if (m[linhas][colunas] != m[outrasLinhas][colunas]) {
              iguais = false;
              break;
            }
          }

          if (iguais) {
            System.out.println("linha " + linhas + " eh igual a linha " + outrasLinhas);
          }

        }        

      }
  }
}
