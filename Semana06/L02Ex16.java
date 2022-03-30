import java.util.Scanner;

public class L02Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valorPrestacao, salario, valorDoEmprestimo, margem30;
        int quantParcelas;  

        System.out.println("Bem vindo ao IFBank - Seu banco especial sem juros!");
        System.out.println("Informe seu salario");
        salario = in.nextFloat();

        margem30 = salario * 0.3f;
        System.out.println("Sua margem de emprestimo eh de " + margem30);

        System.out.println("Informe o valor que vc precisa emprestado");
        valorDoEmprestimo = in.nextFloat();

        System.out.println("Em quantas vezes vc quer quitar?");
        quantParcelas = in.nextInt();

        valorPrestacao = valorDoEmprestimo / quantParcelas;

        System.out.println("Valor da prestacao calculado: " + valorPrestacao);

        if (margem30 >= valorPrestacao) {
            System.out.println("EMPRESTIMO PODE SER CONCEDIDO");
        } else {
            float excedente = valorPrestacao - margem30;
            System.out.println("O valor da parce excede " + excedente + " da  sua margem de 30%");
        }
    }
}
