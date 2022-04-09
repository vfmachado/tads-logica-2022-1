import java.util.Scanner;

public class Bee1072 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe quantos valores serão lidos");
        int n = in.nextInt();
        int contador = 0;
        int valor;
        int dentro = 0, fora = 0;

        while (contador < n) {
            System.out.println("Informe o " + contador +  "o valor");
            valor = in.nextInt();

            if (valor >= 10 && valor <= 20) {
                dentro++;
            } else {
                fora++;
            }

            contador++;
        }

        System.out.println("VALORES DENTRO " + dentro );
        System.out.println("VALORES FORA " + fora );
    }
}
