import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Me informe o valor");
        float valor = in.nextFloat();
        float aumento = valor * 0.2f;
        float total = valor + aumento;
        System.out.println("TOTAL COM O AUMENTO DE 20% EH " + total);
    }
}
