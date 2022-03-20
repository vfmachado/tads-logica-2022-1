import java.util.Scanner;

public class MediaPond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2, notaFinal;

        System.out.println("Informe as notas");
        nota1 = in.nextDouble();
        nota2 = in.nextDouble();

        notaFinal = (nota1 * 3.5 + nota2 * 7.5)/11;

        System.out.printf("NOTA: %.5f\n", notaFinal);
    }
}
