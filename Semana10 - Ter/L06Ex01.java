import java.io.Console;
import java.util.Scanner;

public class L06Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mulheresConcursadas = 0;
        int totalHomens = 0;
        float maiorHomem = 0;
        int mulheresSemConcurso = 0;
        int totalConcursados = 0;
        
        int quantMediaAltura = 0;
        float somaAltura = 0;
        
        int matricula;

        do {
            System.out.println("Informe a matricula");
            matricula = in.nextInt();
            if (matricula == 0) break;

            System.out.println("Informe a idade, genero, altura e concursado (S/N)");
            int idade = in.nextInt();
            char genero = in.next().charAt(0);
            // String genero = in.next();
            float altura = in.nextFloat();
            char concursado = in.next().charAt(0);

            if (genero == 'F' && concursado == 'S')
                mulheresConcursadas++;

            if (genero == 'M') {
                totalHomens++;

                if (concursado == 'S' && idade > maiorHomem) {
                    maiorHomem = idade;
                }

                if (idade <  40) {
                    somaAltura += altura;   // var = var + alguma coisa
                    quantMediaAltura++;
                }
                    
            }
                
            if (genero == 'F' && idade > 30 && concursado == 'N')
                mulheresSemConcurso++;

            if (concursado == 'S') 
                totalConcursados++;

        } while (matricula != 0);
        // somaAltura = somaAltura / quantMediaAlturas
        somaAltura /=  quantMediaAltura;

        System.out.println("a) o número de funcionárias concursadas: " + mulheresConcursadas);

        System.out.println("b) o número de funcionários (somente homens): " + totalHomens);
        System.out.println("c) a maior idade dos homens concursados: " + maiorHomem);

        System.out.println("d) a quantidade de mulheres com mais de 30 anos sem concurso: " + mulheresSemConcurso);

        System.out.println("e) a quantidade de concursados(as): " + totalConcursados);

        System.out.println("f) a média das alturas dos homens com menos de 40 anos: " + somaAltura);
        
    }
}
