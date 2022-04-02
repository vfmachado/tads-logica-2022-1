import java.util.Random;
import java.util.Scanner;

public class RepetJogo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("BEM VINDO AO GUESS A NUMBER");
        int numeroSecreto = aleatorio.nextInt(11);
        System.out.println(numeroSecreto);
        int numeroUsuario;
        int tentativas = 1;

        System.out.println("Hey alun@, adivinhe o numero");
        numeroUsuario = in.nextInt();

        while (numeroUsuario != numeroSecreto
        && tentativas < 3) {
            System.out.println("ERROU, tente novamente");
            numeroUsuario = in.nextInt();
            tentativas++;
        }
        
        if (numeroSecreto  == numeroUsuario)
            System.out.println("PARABENS VC ACERTOU COM " + tentativas + " TENTATIVAS");
        else
            System.out.println("VC USOU TODAS AS TENTATIVAS");
    }
}
