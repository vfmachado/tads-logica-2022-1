import java.util.Scanner;

public class Palavra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String palavra = "BONITO";
        char[] palavraChar = "BONITO".toCharArray();
        
        // i => idx / index => indice 
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            System.out.println(letra);
        }

        System.out.println("Informe uma letra");
        char escolhida = in.next().charAt(0);   // pegar uma letra em java
        for (int i = 0; i < palavraChar.length; i++) {
            char letra = palavraChar[i];

            // aspas simples para comparar char
            if (letra == escolhida) {
                System.out.println("tem a letra "+escolhida+" nesta palavra na posicao " + i);
            }
            // System.out.println(letra);
        }
    }
}
