import java.util.Scanner;

public class M02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 5 alunos, cada aluno tem 3 notas
        // matriz 5 x 4
        final int QUANT_ALUNOS = 5;
        final int QUANT_NOTAS = 4;
        float[][] notas = new float[QUANT_ALUNOS][QUANT_NOTAS];

        System.out.println("Vamos a etapa de inserção das notas");

        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.println("ALUNO " + i);
            float media = 0;
            for (int n = 0; n < 3; n++) {
                System.out.print("Informe a " + (n+1) + " nota: ");
                notas[i][n] = in.nextFloat();
                media = media + notas[i][n];
            }
            // media
            notas[i][3] = media/3;
        }
        // resultado (a média das tres) será armazenado na quarta coluna

        // MOSTRAR A MATRIZ BONITINHA <3
        System.out.println("NOME \t  N1  N2  N3  MEDIA");
        for (int i = 0; i < QUANT_ALUNOS; i++) {
            System.out.print("ALUNO " + i + "\t");
            for (int j = 0; j < QUANT_NOTAS; j++) {
                System.out.printf(".2f  ", notas[i][j]);
            }
            System.out.println();
        }
    }
}
