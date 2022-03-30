import java.util.Scanner;

public class L03Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe os 3 valores");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // para compor um triangulo, cada lado deve ser menor que a soma dos outros lados
        /*
            3   4   5           
            3 < 4 + 5       a < b+c
            4 < 3 + 5       b < a+c
            5 < 3 + 4       c < a+b
        */

        if (
            a < b + c &&
            b < a + c &&
            c < a + b
        )
            System.out.println("PODEM SER LADOS DE UM TRIANGULO");
        else
            System.out.println("NAO PODEM FORMAR UM TRIANGULO");
    }
}
