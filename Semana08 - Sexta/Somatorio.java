import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        /* 
        DADO DOIS NUMEROS INTEIROS A e B SENDO A < B,  DETERMINA A SOMA DE TODOS OS VALORES DO INTERVALO
        EX
        [2, 5] = 2 + 3 + 4 + 5
        */
        Scanner in = new Scanner(System.in);
        int a, b, soma = 0;
        System.out.println("Informe os dois valores");
        a = in.nextInt();
        b = in.nextInt();

        if (a <= b) {
            while (a <= b) {
                System.out.println(a);
                soma = soma + a;
                a++;
            }
        } else {
            /*while (b <= a) {
                System.out.println(a);
                soma = soma + a;
                a--;
            }*/
            while (b <= a) {
                System.out.println(b);
                soma = soma + b;
                b++;
            }
        } 

        System.out.println("SOMA " + soma);
    }
}