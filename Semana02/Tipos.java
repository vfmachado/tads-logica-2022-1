import java.util.Scanner;

/*

    VARIÁVEL => ALGO QUE PODE MUDAR (TEM O VALOR ATERÁVEL)    

        TIPO    NOME  =  VALOR;

        declarando e inicializando
        int numero = 5;
        int numero;
        numero = 5;

        int => inteiros
        float => valores decimais
        double => valores decimais (mais precisão)
        boolean => true / false
        char => 1 letra
        String => conjunto de letras

        byte
        short
        long

    CONSTANTE => TEM O VALOR DEFINIDO APENAS 1 VEZ
*/

public class Tipos {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //constante em java => FINAL
    final int qtdAlunosChamada = 12;
    int qtdAlunosPresente;

    System.out.print("Quantos alunos presentes? ");
    qtdAlunosPresente = in.nextInt();

    System.out.println("... para essa quantidade: ");
    float relacao = ( (float)qtdAlunosPresente / qtdAlunosChamada ) * 100;
    System.out.println(relacao +  "% dos alunos vieram a aula");

    System.out.println("Quantos alunos da turma são do genero masculino");
    int masculino = in.nextInt();

    relacao = ( (float)masculino / qtdAlunosChamada ) * 100;
    System.out.println(relacao + "% dos alunos são do genero masculino");

    final float fPI = 3.141592f;  // forçando que minha variável seja float
    final double dPI = 3.141592;

    System.out.println(fPI);
    System.out.printf("%.2f\n", fPI); // BEECROWD (ANTIGO URI)
    in.close();
  }
}