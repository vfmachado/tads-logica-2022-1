import java.util.Random;

public class Matrizes {
    public static void main(String[] args) {
        Random random = new Random();
        int linhas = Integer.parseInt(args[0]);
        int colunas = Integer.parseInt(args[1]);

        int[][] mat = new int[linhas][colunas];

        for (int i = 0; i < mat.length; i++) {   // linhas
            for (int j = 0; j < mat[i].length; j++) { // colunas
                mat[i][j] = random.nextInt(74) +1;
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
