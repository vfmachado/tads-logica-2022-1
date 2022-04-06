import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // PROGRAMA QUE CALCULE A MÉDIA DE N NOTAS
        System.out.println("Quantas notas serão inseridas?");
        int quantidadeValores = in.nextInt();
        int contador = 0;
        
        float media = 0.0f;
        // PASSO 1. REPETIR O MESMO BLOCO  N vezes
        while (contador < quantidadeValores) {
            System.out.println("MSG");
            contador++;

            // PASSO 2. LER O VALOR DA NOTA
            System.out.println("Informe a nota");
            float nota = in.nextFloat();

            // PASSO 3. ACUMULAR A NOTA EM UMA VARIAVEL
            media = media + nota;

            System.out.println("SOMA PARCIAL... " + media);
        }
                        
        // PASSO 4. CALCULAR A MEDIA (DIVISAO)
        media = media / quantidadeValores;
        System.out.println("MEDIA TOTAL DA TURMA :"  + media);
    }
}
