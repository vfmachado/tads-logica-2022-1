import java.util.Random;

public class Ex01 {
    public static void main(String[] args) {
        Random aleat = new Random();
        int TAM = 10;
        int M[][] = new int[TAM][TAM];
        int indiceAtual = 0;
        int repetiu = 0;
        do {
            int sorteado = aleat.nextInt(101);
            // percorrer a matriz, verificando se o numero nao repete
            boolean repete = false;
            for (int a = 0; a < indiceAtual; a++) {
                if (M[a/TAM][a%TAM] == sorteado) { repete = true; break;}
            }
            // se nao repetir, adicionar na matriz
            if (!repete) {
                M[indiceAtual/TAM][indiceAtual%TAM] = sorteado;
                indiceAtual++;
            } else {
                repetiu++;
            }
        } while (indiceAtual < TAM*TAM);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print(M[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Houveram " + repetiu + " repeticoes");
    }
}