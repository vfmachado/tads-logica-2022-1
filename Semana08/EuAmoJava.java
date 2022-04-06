import java.util.Scanner;

public class EuAmoJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ama quanto? Insira um numero");
        int ama = in.nextInt();

        System.out.print("EU AM");
        while(ama > 0) {
            System.out.print("O");
            ama--;
        }
        System.out.println(" JAVA");
    }
}
