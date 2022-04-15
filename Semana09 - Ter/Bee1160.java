import java.util.Scanner;

public class Bee1160 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testes;
        int populacaoA, populacaoB;
        double taxaA, taxaB;    // 10 => 10%  => 0,1   
        int anos;

        testes = in.nextInt();
        
        while (testes > 0) {
            testes--;

            populacaoA = in.nextInt();
            populacaoB = in.nextInt();
            taxaA = in.nextDouble();
            taxaB = in.nextDouble();
            
            anos = 0;
            while (populacaoA <=  populacaoB && anos <= 100) {
                // populacaoA = (int) (populacaoA * (1 + taxaA/100));
                populacaoA += populacaoA * (taxaA/100);
                populacaoB += populacaoB * (taxaB/100);

                // System.out.println("Passou mais um ano...");
                anos++;
                // System.out.println("Populacao A: " + populacaoA );
                // System.out.println("Populacao B: " + populacaoB );

            }

            if (anos <= 100)
                System.out.println(anos + " anos.");
            else
                System.out.println("Mais de 1 seculo.");
        
        
        }
    }
}
