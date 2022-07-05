public class VemM {
  public static void main(String[] args) {
    int [][] m = {
      {3, 3, 3, 3},
      {1, 2, 3, 4},
      {1, 3, 3, 2},
      {2, 4, 3, 4}
    };

    /*  <3 PROCURAR LINHAS IGUAIS EM UMA MATRIZ <3  */

    int [] v = { 3, 3, 3, 3};
    boolean dprincipal = true;
    boolean dsecundaria = true;

    for (int i = 0; i < v.length; i++) {  // passa por todas linhas
      boolean linigual = true;
      boolean coligual = true;
      for (int j = 0; j < v.length; j++) {  // passa por todas colunas
        if (v[j] != m[i][j]) {
          linigual = false;
        }
        if (v[j] != m[j][i]) {
          coligual = false;
        }
      }

      if (v[i] != m[i][i]) {
        dprincipal = false;
      }

      if (v[i] != m[i][m.length-1-i]) {
        dsecundaria = false;
      }
    
      // passei por toda linha..
      if (linigual) {
        System.out.println("Linha " + i + " eh igual!!!");
      }
      if (coligual) {
        System.out.println("Coluna " + i + " eh igual!!!");
      }     
    }

    if (dprincipal) {
      System.out.println("Diagonal principal eh igual");
    }

    if (dsecundaria) {
      System.out.println("Diagonal principal eh igual");
    }
  }
}
