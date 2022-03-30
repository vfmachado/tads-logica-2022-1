import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean var;
        int n1 = 5, n2 = 3;
        /*
         * n1 > n2 true
         * n1 >= n2 true
         * n1 < n2 false
         * n1 <= n2 false
         * n1 == n2 false
         * n1 != n2 true
         */

        // CASO DE MULTIPLOS IFS...
        // EXEMPLO CATEGORIA DE IDADE
        /*
         * < 12 CRIANÇA
         * < 18 ADOLESCENTE
         * < 60 ADULTO
         * >= MELHOR IDADE
         * 
         * // duas condições com E (&&)
         * if (idade >= 12 && idade < 18) {
         * System.out.println("ADOLESCENTE");
         * }
         */

        System.out.print("IDADE: ");
        int idade = in.nextInt();

        if (idade < 12) {
            System.out.println("CRIANCA");
        } else if (idade < 18) {
            System.out.println("ADOLESCENTE");
        } else if (idade < 60) {
            System.out.println("ADULTO");
        } else {
            System.out.println("MELHOR IDADE");
        }
        

    }
}
