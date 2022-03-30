import java.util.Scanner;

public class L02Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantMacas;
        float precoTotal;
        
        System.out.println("Quantas maças vc deseja?");
        quantMacas = in.nextInt();

        if (quantMacas >=  20) {
            precoTotal = quantMacas * 1.15f;
        } else if (quantMacas >= 12) {
            precoTotal = quantMacas * 1.3f;
        } else {
            precoTotal = quantMacas * 1.5f;
        }

        System.out.printf("Voce deve pagar R$ %.2f \n", precoTotal);
    }
}
