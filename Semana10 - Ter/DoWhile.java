import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        while (condicao) {

        }
        */
        int a = 1, b;
        do {
            System.out.println(a);
            a++;
            b = in.nextInt();
        } while (a < b);
    }
}
