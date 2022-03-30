import java.util.Scanner;

public class Revisao {

    // MAIN => METODO PRINCIPAL
    public static void main(String[] args) {
        //DECLARAÇAO E INICIALIZAÇAO
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe um numero");
        int numero = in.nextInt();

        if (numero >= 7) {
            System.out.println("Estudante APROVADO");
        } else if (numero > 3) {
            System.out.println("Estudante tem nota para exame...");
        } else {
            System.out.println("Sinto muito, semestre que vem tem mais");
        }

    }
}