import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //POR EXEMPLO DO 1 AO 10
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        //   INICIO       TESTE LOGICO     PASSO (INC/DEC)
        for ( int b = 1, c = 2 ;  b <= 10 && c %2 == 0  ; b++  ) {
            System.out.println(b);
            c = in.nextInt();
        }
    }
}
