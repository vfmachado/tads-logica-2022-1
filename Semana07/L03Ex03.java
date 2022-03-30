import java.util.Scanner;

public class L03Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe os 3 valores");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int soma; 
        if (a > b && b > c) {   // A e B sao os maiores
            soma = a + b;
        } else if (a > c && c > b) { // A e C sao os maiores
            soma = a + c;
        } else {    // B e C sao os maiores
            soma = b + c;
        }

        // if (a < b && a < c) {
        //     soma = b + c;
        // } else if (b < a && b < c) {
        //     soma = a + c;
        // } else {
        //     soma = a + b;
        // }

        System.out.println("SOMA DOS MAIORES EH " + soma);
    }
}
