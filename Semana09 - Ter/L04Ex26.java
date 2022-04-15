import java.util.Scanner;

public class L04Ex26 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int voto = 0, quantA = 0, quantB = 0, quantC = 0, brancos = 0, nulos = 0;

        System.out.println("Votacao rodando...");
        System.out.println("1. Drica");
        System.out.println("2. Anderson");
        System.out.println("3. Valber");
        System.out.println("4. Branco");
        System.out.println("5. Nulo");
        
        while (voto != -1) {
            System.out.println("Informe um voto");
            voto = in.nextInt();

            if (voto == 1) quantA++;
            else if (voto == 2) quantB++;
            else if (voto == 3) quantC++;
            else if (voto == 4) brancos++;
            else if (voto == 5) nulos++;
            else if (voto == -1) System.out.println("Encerrando");
            else {
                System.out.println("OPCAO INVALIDA");
            }
        }
        System.out.println("Resultado");
        System.out.println("Opcao 1: " + quantA);
        System.out.println("Opcao 2: " + quantB);
        System.out.println("Opcao 3: " + quantC);
        System.out.println("Brancos: " + brancos);
        System.out.println("Nulos: " + nulos);

        if (quantA > quantB && quantA > quantC) 
            System.out.println("Opcao A ganhou");

        else if (quantB > quantA && quantB > quantC) 
            System.out.println("Opcao B ganhou");
    
        else
            System.out.println("Opcao C ganhou");
    }
}