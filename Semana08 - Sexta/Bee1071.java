import java.util.Scanner;

public class Bee1071 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, y, soma = 0;

        System.out.println("Informe dois valores");
        x = in.nextInt();
        y = in.nextInt();

        int menor, maior;
        if (x <= y) {
            menor = x;
            maior = y;
        } else {
            menor = y;
            maior = x;
        }
        System.out.println("MENOR " + menor);
        System.out.println("MAIOR " + maior);
        menor++;
        while (menor < maior) {
            System.out.println(menor);
            // if (menor % 2 == 1 || menor % 2 == -1) {
            if (menor % 2 != 0) {
                System.out.println("IMPARES " +  menor);
                soma = soma + menor;
                System.out.println("SOMA PARCIAL " + soma);
            }
            menor++;
        }

        System.out.println(soma);
    }
}
