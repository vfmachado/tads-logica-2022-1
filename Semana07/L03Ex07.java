import java.util.Scanner;

public class L03Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final float valorGasolina = 4.3f;
        final float valorAlcool = 3.9f;
        
        float desconto;
        
        // char tipo;
        String tipo;
        float litros;
        float total;

        System.out.println("Informe o tipo (A ou G) e quantidade de litros");
        tipo = in.next().toUpperCase();
        litros = in.nextFloat();

        System.out.println("MEU PROGRAMA FUNCIONA E O USUARIO DIGITOU TIPO: " + tipo + " LITROS " + litros );

        if (tipo.equals("A")) {
            System.out.println("USUARIO ESCOLHEU ALCOOL");
            if (litros < 20) {
                desconto = 0.97f;
            } else {    // >= 20
                desconto = 0.95f;
            }
            total = litros * valorAlcool * desconto;
            System.out.printf("PREÇO TOTAL ALCOOL: R$ %.2f\n", total);

        } else if (tipo.equals("G")) {
            System.out.println("HMM VAI DE GASOLINA");
            if (litros < 20) {
                desconto = 0.96f;
            } else {    // >= 20
                desconto = 0.94f;
            }
            total = litros * valorGasolina *  desconto;
            System.out.printf("PREÇO TOTAL GASOLINA: R$ %.2f\n", total);

        } else {
            System.out.println("TIPO INVALIDO!!!");
        }
        

    }
}
