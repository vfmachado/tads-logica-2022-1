import java.util.Random;
import java.util.Scanner;

public class L08Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lados[] = new int[6];
        Random aleat = new Random();

        System.out.println("Informe os lancamentos, 0 para finalizar");
        int resultado;
        
        int sorteios = in.nextInt();

        for (int i = 0; i < sorteios; i++) {
            resultado = aleat.nextInt(6) +1;

            // System.out.println("Qual o valor sorteado? " + resultado);
            
            if (resultado > 0 && resultado <= 6) {
                lados[resultado-1]++;
            }
        }
            
       

        System.out.println("Cada valor saiu: ");
        for (int i = 0; i < 6; i++) {
            System.out.println("O lado " + (i+1) + " foi sorteado " + lados[i] + " vezes");
        }
    }
}
