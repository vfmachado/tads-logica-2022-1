import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salario = -1f;
        float imposto;
        float somaImpostos = 0.0f;
        while (salario != 0.0f) {
            System.out.println("Informe o salario da pessoa");
            salario = in.nextFloat();
            
            if (salario > 4500.0f) {
                System.out.println("80 + 270 + taxa excedente dos 4500");
                imposto = 80 + 270 + (salario - 4500.0f) * 0.28f;
                System.out.println(imposto);
            } else if (salario > 3000.0f) {
                System.out.println("80 + taxa excedente dos 3000");
                imposto = 80 +  (salario - 3000.0f) * 0.18f;
                System.out.println(imposto);
            } else if (salario > 2000.0f) {
                System.out.println("taxa excedente dos 2000");
                imposto = (salario - 2000.0f) * 0.08f;
                System.out.println(imposto);
            } else {
                imposto = 0;
                System.out.println("ISENTO");
            }
            somaImpostos += imposto;    // somaImpostos = somaImpostos + imposto;
            System.out.println("SOMA " + somaImpostos);
        }

    }
}
