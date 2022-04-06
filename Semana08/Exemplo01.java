import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contador = 0;
        while (contador <= 10) {
            System.out.println("Alguma coisa qualquer");
            System.out.println(contador);
            contador++; // contador = contador + 1;
        }

    }
}