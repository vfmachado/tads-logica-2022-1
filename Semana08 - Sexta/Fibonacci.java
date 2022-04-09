import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        /*
        
            1   1   2   3   5   8   13  21  34  55  89 ...

            5 termos
                1   1   2   3   5

            8 termos 
                1   1   2   3   5   8   13  21

            20 termos
                ...
        */

        Scanner in = new Scanner(System.in);
        int a, b, c, n = 10;

        // 1    1   2   3   5   8
        a = 1;          //   1
        b = 1;          //   1
        
        System.out.print("1  1  ");
        
        while (n > 2) {
            c = a + b;      //  2
            System.out.print(c + "  ");

            a = b;  // 1
            b = c;  // 2
           
            n--;
        }
        
    }
}
