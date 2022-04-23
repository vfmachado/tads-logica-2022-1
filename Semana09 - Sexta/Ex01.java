import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        
        System.out.println("Informe os 3 valores");
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();

        if (a == 90.0f || b == 90.0f || c == 90.0f) {
            System.out.println("Triangulo RETANGULO");
        } else if (a > 90.0f || b > 90.0f || c > 90.0f) {
            System.out.println("Triangulo OBTUSANGULO");
        } else {
            System.out.println("Triangulo ACUTANGULO");
        }
    }
}