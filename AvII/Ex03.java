public class Ex03 {
    public static void main(String[] args) {
        int[][] m = {
            {8, 0, 7},
            {4, 5, 6},
            {3, 10, 2}
        };

        int somaPadrao = 0;

        // considera magico por padrao
        boolean magico = true;

        // soma os elementos da primeira linha - referencia de soma
        for (int i = 0; i < m.length; i++) {
            somaPadrao += m[0][i];
        }

        // soma as linhas e colunas verificando com a soma padrao
        for (int i = 0; i < m.length; i++) {
            int somaLinha = 0;
            int somaColuna = 0;
            for (int j = 0; j < m.length; j++) {
                somaLinha += m[i][j];
                somaColuna += m[j][i];
            }
           if (somaLinha != somaPadrao || somaColuna != somaPadrao) {
               magico = false;
           }
        }

        // soma das diagonais
        int diagP = 0;
        int diagS = 0;
        for (int i = 0; i < m.length; i++) {
            diagP += m[i][i];  
            diagS += m[i][m.length-1-i]; 
        }

        if (diagP != somaPadrao || diagS != somaPadrao) {
            magico = false;
        }

        if (magico) System.out.println("eh quadrado magico");
        else System.out.println("nao eh quadrado magico");
    }
}
