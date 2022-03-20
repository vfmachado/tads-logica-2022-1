import java.util.Scanner;

public class Ex1009 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String nome;
    double salario, vendido;
   
    nome = in.next();
    salario = in.nextDouble();
    vendido = in.nextDouble();

    final double taxa = 0.15;

    double total = salario + vendido * taxa;
    System.out.printf("TOTAL = R$ %.2f", total);

    in.close();
  } 
}
