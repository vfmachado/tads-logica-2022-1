import java.util.Scanner;

public class Composto {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.print("Informe 3 valores: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // PROGRAMA DEVE MOSTRAR O MAIOR VALOR
        if (a > b && a > c) {
            System.out.println("A eh maior");
        }

        else if (b > a && b > c) {
            System.out.println("B eh maior");
        }
    
        else {
            System.out.println("C eh maior");
        }

        /*
            OPERADOR LOGICO CHAMADO "OU"  EM JAVA UTILIZAMOS DOIS PIPES
            || => 2 PIPES <=> OU
        
        */
        System.out.println("Informe sua idade");
        int idade = in.nextInt();

        // (-inf, 16] U [60, +inf)
        if (idade <= 16 || idade >= 60) {
            System.out.println();
        }

        System.out.println("Informe o time que vc torce ou 'nenhum' ");
        String time = in.next();
        // time == "gremio"
        if (time.equals("gremio") || time.equals("inter")) {
            System.out.println("Provavelmente GAUCHO(A)");
        }

    }
}
