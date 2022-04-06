import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float saldo = 0.0f;
        String extrato = "";
        int opcao = 0;
        while (opcao != -1) {
            System.out.println("Selecione uma opcao");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Ver extrato");
            System.out.println("-1. Sair");

            opcao = in.nextInt();
            
            if (opcao == 1) {
                System.out.println("Quanto vc quer depositar?");
                float deposito = in.nextFloat();

                extrato = extrato +
                "Deposito efetuado " + deposito + "\n";

                saldo = saldo + deposito;
            } else if (opcao == 3) {
                System.out.println("Saldo R$" + saldo);
            } else if (opcao == 4) {
                System.out.println(extrato);
            }

        }

    }
}