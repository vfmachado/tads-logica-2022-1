
import java.util.Scanner;

public class Exercicio02b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Me informe o valor e a taxa (porcentagem) de juros");
        
        float valor = in.nextFloat();
        float taxa = in.nextFloat();
        float total = valor + valor * taxa/100;

        System.out.println("Para esta taxa, o valor total é: " + total);
    }
}
