import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes = in.nextInt();

        // identificar a qual trimestre pertence o numero do mes digitado
        switch (mes) {
            case 1:
            case 2:
            case 3:
                System.out.println("Primeiro trimestre");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Segundo trimestre");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Terceiro trimestre");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Quarto trimestre");
                break;
            default:
                System.out.println("numero digitado nao corresponde a um mes");
        }
    }
}
