import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, quadrado;
        System.out.println("Hey, me diz um numero... ");
        numero = in.nextInt();
        quadrado = numero * numero;
        System.out.println("O quadrado de " + numero + " é igual a " + quadrado);
    }
}
