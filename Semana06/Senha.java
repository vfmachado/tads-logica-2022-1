import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int senha = 4321;
        
        System.out.println("Informe a senha");
        int tentativa = in.nextInt();

        boolean deuCerto = senha == tentativa;
        
        // senha invalida
        // ! => NAO
        if (!deuCerto) {
            System.out.println("Senha invalida");
        } else {
        // senha correta    
            System.out.println("Senha correta");
        }

        if (deuCerto) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Senha invalidade");
        }
    }
}
