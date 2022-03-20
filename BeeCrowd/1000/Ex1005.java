import java.util.Scanner;

public class Ex1005 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double a, b;
    a = in.nextDouble();
    b = in.nextDouble();
    
    double nota = (a * 3.5 + b * 7.5) / 11; // 3.5 + 7.5 = 11

    System.out.printf("MEDIA = %.5f\n", nota);

    in.close();
  } 
}
