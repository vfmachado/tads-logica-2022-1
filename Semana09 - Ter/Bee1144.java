import java.util.Scanner;

public class Bee1144 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quadrado, cubo;
        int n = in.nextInt();
        int cont = 1;
        
        while (cont <= n) {
            quadrado = cont * cont;
            cubo = quadrado * cont;
            System.out.println(cont + " " + quadrado + " " + cubo);
            quadrado = quadrado + 1;
            cubo = cubo + 1;
            System.out.println(cont + " " + quadrado + " " + cubo);
            cont++; 
        }
    }
}
