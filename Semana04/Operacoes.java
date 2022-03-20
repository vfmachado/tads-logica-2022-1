import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        /*
        FAÇA UM PROGRAMA QUE DADO 2 VALORES INTEIROS
        APRESENTE AO USUÁRIO O RESULTADO DAS 4 OPERAÇÕES
            ADICAO
            SUBTRACAO
            MULTIPLICACAO
            DIVISAO

        "INFORME DOIS VALORES"
        10  4
            ADD 14
            SUB 6
            MULT 40
            DIV 2    
        */
        Scanner in = new Scanner(System.in);
        // DECLARAR MULTIPLAS VARIAVEIS DO MESMO TIPO NA MESMA LINHA
        int numero1, numero2, add, sub, mult, div;
        System.out.println("Informe dois valores");
        numero1 = in.nextInt();
        numero2 = in.nextInt();

        add = numero1 + numero2;
        sub = numero1 - numero2;
        mult = numero1 * numero2;
        div = numero1 / numero2;

        System.out.println("add: " + add);
        System.out.println("sub: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
    }   
}
