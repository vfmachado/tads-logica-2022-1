import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        int cod = 0;
        while (true) {
            System.out.println(
                "1. Criar nova conta\n"+
                "2. Acessar conta\n"+
                "3. Sair" 
            );
            int op = in.nextInt();
            if (op == 3) break;


            switch (op) {
                case 5432:
                    for (ContaBancaria contaBancaria : contas) {
                        System.out.println(contaBancaria.nome);
                    } 
                    break;

                case 1:
                    System.out.println("Informe seu nome");
                    String nome = in.next();
                    ContaBancaria novaConta = new ContaBancaria(nome, "2022" + cod);
                    cod++;
                    contas.add(novaConta);
                    System.out.println("O codigo da sua conta recem criada eh " + novaConta.conta);
                    break;

                case 2: 
                    System.out.println("Informe o cod da sua conta");
                    String codConta = in.next();
                    ContaBancaria procurada = null;
                    for (int i = 0; i < contas.size(); i++) {
                        if (contas.get(i).conta.equals(codConta)) {
                            procurada = contas.get(i);
                            break;
                        }
                    }
                    if (procurada != null)
                        System.out.println(procurada);
                    else
                        System.out.println("Conta nao encontrada");

            }
        }
    }
}
