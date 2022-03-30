import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float area, base, altura;
        System.out.println("Informe a base e a altura ... ");
        
        base = in.nextFloat();
        altura = in.nextFloat();
        area = base * altura;

        System.out.println("A area deste triangulo eh de " + area);
    }
}
