import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o valor de N? ");
        int n = in.nextInt();
        int cont = 1;
        int fat = 1;

        while (cont <= n) {
            System.out.println(cont);
            
            fat = fat*cont; 
            
            cont = cont + 1;    //cont++;
        }
        System.out.println("DEPOIS DO WHILE");
        System.out.println("RESULTADO DO FATORIAL");
        System.out.println(fat);
    }
}
