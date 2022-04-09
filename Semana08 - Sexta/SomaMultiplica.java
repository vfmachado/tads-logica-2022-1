import java.util.Scanner;

public class SomaMultiplica {
    public static void main(String[] args) {
        /*
        DADO UM INTERVALO A, B.
        CALCULAR A SOMA DE TODOS OS VALORES DO INTERVALO MULTIPLICANDO CADA VALOR PELA SUA "POSICAO", CONSIDERANDO A PRIMEIRA COMO 1.
        EXEMPLO:
        [3, 6] = 3 * 1 + 4 * 2 + 5 * 3 + 6 * 4
        */
        Scanner in = new Scanner(System.in);
        int a, b, pos = 1, soma = 0;
        System.out.println("2 valores: ");
        a = in.nextInt();
        b = in.nextInt();

        while (a <= b) {
            System.out.println(a +  " pos " + pos);
            soma = soma + a * pos;
            a++;
            pos = pos + 1;
        }

        System.out.println("SOMA COM A MULT " + soma);
    }
}
