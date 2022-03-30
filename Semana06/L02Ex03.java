import java.util.Scanner;

public class L02Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor...");
        int valor = in.nextInt();
        if (valor >= 0) {
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
    }
}
