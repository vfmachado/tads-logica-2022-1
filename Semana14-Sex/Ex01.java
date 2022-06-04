import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] v1, v2, v3, v4;
        v1 = new int[10];
        v2 = new int[10];
        v3 = new int[10];
        v4 = new int[10];

        System.out.println("Informe 10 valores para o primeiro vetor");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = in.nextInt();
        }

        System.out.println("Informe 10 valores para o segundo vetor");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = in.nextInt();
        }

        System.out.println("Informe 10 valores para o terceiro vetor");
        for (int i = 0; i < v3.length; i++) {
            v3[i] = in.nextInt();
        }

        for (int i = 0; i < v4.length; i++) {
            int menor = v1[i];
            if (v2[i] < menor)
                menor = v2[i];
            
            if (v3[i] < menor)
                menor = v3[i];
        
            v4[i] = menor;
        }

        System.out.println("RESULTADO");
        for (int i = 0; i < v4.length; i++) {
            System.out.print(v4[i] + "   ");
        }
        System.out.println();
        

        System.out.println("TESTE");
    }
}