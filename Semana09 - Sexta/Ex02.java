import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = in.nextInt(); //1257 reais

        int n5 = 0;
        if (valor % 2 == 1) {
            valor -= 5;
            n5 = 1;
        }

        int n100 = valor / 100;
        valor = valor % 100;    // valor = valor - (n100 * 100)

        int n50 = valor / 50;
        valor = valor % 50; 
        
        int n20 = valor / 20;
        valor = valor % 20; 

        int n10 = valor / 10;
        valor = valor % 10; 

        // int n5 = valor / 5;
        // valor = valor % 5; 

        int n2 = valor / 2;
        valor = valor % 2; 

        System.out.println("NOTAS DE 100 = " + n100);
        System.out.println("NOTAS DE 50 = " + n50);
        System.out.println("NOTAS DE 20 = " + n20);
        System.out.println("NOTAS DE 10 = " + n10);
        System.out.println("NOTAS DE 5 = " + n5);
        System.out.println("NOTAS DE 2 = " + n2);
        
    }   
}
