/*


*/
public class Repet01 {
    public static void main(String[] args) {
        int valor = 1;

        // enquanto executa até que a condição seja falsa
        while (valor <= 10 ) {
            System.out.println("Valor no inicio do while: " + valor );
            valor++;    // valor = valor + 1
        }

        System.out.println("VALOR FORA DO WHILE: " + valor );
    }
}