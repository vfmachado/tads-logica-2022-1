import java.util.Scanner;

public class L03Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
            timeA = GREMIO
            timeB = INTER

            golsA = 3
            golsB = 4

            golsA > golsB
                timeA
            
            golsB >  golsA
                time B

            EMPATE
        */

        String timeA, timeB;
        int golsA, golsB;

        System.out.println("Informe o nome dos times");
        timeA = in.next();
        timeB = in.next();

        System.out.println("Informe os gols do " + timeA);
        golsA = in.nextInt();

        System.out.println("Informe os gols do " + timeB);
        golsB = in.nextInt();

        if (golsA > golsB) System.out.println(timeA);
        else if (golsB > golsA) System.out.println(timeB);
        else System.out.println("EMPATE");
    }
}
