import java.util.Scanner;

public class Ex1001 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int a, b;

    a = in.nextInt();
    b = in.nextInt();

    int x = a + b;
    System.out.println("X = " + x);

    in.close();
  } 
}
