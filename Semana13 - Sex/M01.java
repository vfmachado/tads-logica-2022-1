import java.util.Scanner;

public class M01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] valores;

        final int LINHAS = 3;
        final int COLUNAS = 4;

        valores = new int[LINHAS][COLUNAS];

        valores[0][1] = 5;
        valores[1][3] = 9;
        valores[2][2] = 1;
        valores[2][0] = 3;

        for (int lin = 0; lin < LINHAS; lin++) {
            // System.out.println("LINHA: " + lin);
            for (int col = 0; col < COLUNAS; col++) {
                // System.out.println("\tCOLUNA: " + col);
                // System.out.println("\tLIN " + lin + " COL " + col + " = " + valores[lin][col]);
                System.out.print(valores[lin][col] + "  ");
            }
            System.out.println();
        }
    }
}