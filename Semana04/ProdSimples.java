import java.util.Scanner;

public class ProdSimples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, prod;
        
        System.out.println("informe dois valores:");
        a = in.nextInt();
        b = in.nextInt();

        prod = a * b;
        System.out.println("PROD = " + prod);
    }
}
