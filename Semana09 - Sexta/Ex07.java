import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        int invertido = 0;

        numero = in.nextInt();

        while (numero > 0) {
            int ultimoDigito = numero % 10;
            invertido = (invertido * 10) + ultimoDigito;
            System.out.println(ultimoDigito);
            numero /= 10;  
        }
       
        System.out.println(invertido);
    }
}
