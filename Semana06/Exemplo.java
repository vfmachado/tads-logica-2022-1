import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valores;
        float comVirgula;
        double precisaoCient;
        boolean vOuF;
        String texto;
        char letra;


        System.out.println("Informe seu nome");
        texto = in.next();

        System.out.println("Informe a sua idade");
        valores = in.nextInt();

        int anoNascimento = 2022 - valores;
        System.out.println("Voce nasceu em " + anoNascimento);

    }
}