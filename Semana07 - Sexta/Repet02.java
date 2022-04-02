import java.util.Scanner;

public class Repet02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cod = -1;
        float preco;
        float total = 0;

        /*
            >   >=     <    <=      !=      ==
            &&       ||

        */
        while (cod != 0) {
            System.out.println("Informe o código do produto");
            cod = in.nextInt();
            System.out.println("Informe o valor do produto");
            preco = in.nextFloat();
            total = total + preco;
            System.out.println("PARCIAL: " + total);
        }

        System.out.println("PRECO TOTAL " + total);

    }
}
