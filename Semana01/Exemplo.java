import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;
        System.out.println("Funciona!!!");
        System.out.println("Qual a sua idade?");
        idade = in.nextInt();
        System.out.println("O dobro da idade eh " + (idade * 2));
    }
}
