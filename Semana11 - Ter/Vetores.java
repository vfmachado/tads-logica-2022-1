import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // DECLARAÇÃO E INICIALIZAÇÃO
        float[] notas = new float[5];   
                // NESTE CASO TAMANHO IGUAL 
                // DAS POSICOES 0 ATÉ 4

        notas[0] = 9.5f;
        notas[1] = 6.3f;
        notas[2] = 8.0f;
        notas[3] = 3.0f;
        notas[4] = 0.0f;

                    // notas.length
        for (int i = 0; i < 5; i++) {
            System.out.println(notas[i]);
        }
    }
}