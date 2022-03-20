import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello World, Vini!!!  =)");        
        
        System.out.println("Informe o valor da gasolina e a quantidade de litros");

        double precoGasolina = in.nextDouble();
        double litros = in.nextDouble();

        double valorTotal = precoGasolina * litros;
        System.out.println("Total " + valorTotal);

    }
}
