import java.util.Scanner;

public class L03Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        System.out.println("Informe os 3 valores");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        // a > b > c
        if (a > b && b > c) 
            System.out.println("A: "+ a + " B: " + b + " C: " + c);
        
        // a > c > b
        if (a > c && c > b) // QUANDO O BLOCO TEM APENAS UMA LINHA DE CODIGO, AS CHAVES SÃO OPCIONAIS
            System.out.println("A C B");

        // b > a > c
        // b > c > a

        //c > a > b
        //c > b > a

    }
}
