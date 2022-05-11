import java.util.Scanner;

public class Gabarito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] gabarito = new char[5];
        int quantAlunos;
        System.out.println("Informe as 5 respostas do gabarito");
        for (int i = 0; i < gabarito.length; i++) {
            gabarito[i] = in.next().charAt(0);
        }
        System.out.println("Quantos alunos fizeram a avaliação?");
        quantAlunos = in.nextInt();

        int[] notas = new int[quantAlunos];

        for (int aluno = 0; aluno < quantAlunos; aluno++) {
            System.out.println("Alun@ na posicao " + aluno);
            System.out.println("Informe as respostas d@ alun@");
            int nota = 0;
            for (int i = 0; i < 5; i++) {
                char altEscolhida = in.next().charAt(0);
                if (altEscolhida == 'n') {
                    System.out.println("Preferiu nao responder... tudo bem =)");
                } else if (altEscolhida == gabarito[i]) {
                    System.out.println("ESSA REPOSTA DEU CERTO");
                    nota += 2; // nota = nota + 2;
                } else {
                    System.out.println("ESSA DEU ERRADO");
                    nota -= 1; // nota = nota - 1;
                }
            }
            if (nota < 0)
                nota = 0;
            System.out.println("NOTA FINAL: " + nota);
            notas[aluno] = nota;
        }

        System.out.println("RESUMO DAS NOTAS:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ALUN@ " + i + ": " + notas[i]);
        }

    }
}