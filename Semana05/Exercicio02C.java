import java.util.Scanner;

public class Exercicio02C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // PERGUNTAR PARA O USUARIO UM NUMERO
        System.out.println("Me informe o valor");
        // SABENDO QUE O NUMERO EH REAL, VOU UTILIZAR FLOAT
        float valor = in.nextFloat();
        // VOU CALULAR 20%
        float aumento = valor * 0.2f;
        // VOU SOMAR COM O VALOR
        float total = valor + aumento;
        // float total = valor + valor * 0.2f;
        // float total = valor * 1.2f;
        // float total = valor * 120 / 100;
        // VOU MOSTRAR O RESULTADO
        System.out.println("TOTAL COM O AUMENTO DE 20% EH " + total);
    }
}
