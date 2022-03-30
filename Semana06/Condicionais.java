import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.print("Qual sua a idade? ");
        idade = in.nextInt();

        System.out.println("Antes do bloco");
        // SE (CONDICAO) ENTÃO
        if (idade >= 18) {
            System.out.println("Dentro do bloco");
            System.out.println("Pode entrar...");
        }
        System.out.println("Depois do bloco");

        if (idade < 18) {
            System.out.println("Sorry, nao vai rolar");
        }

    }
}
