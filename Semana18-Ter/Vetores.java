import java.util.Arrays;

public class Vetores {
  public static void main(String[] args) {
    
    int[] v = {1, 5, 3, 2, 4};

    // MOSTRAR UMA MSG PARA O USUARIO SE TEM OU NAO DETERMINADO VALOR NO VETOR
    int procurado = 3;
    boolean tem = false;

    for (int i = 0; i < v.length; i++) {
      if (v[i] == procurado) {
        tem = true;;
        break;
      }
    }

    if (tem) {
      System.out.println("Tem o valor " + procurado + " no vetor");
    } else { 
      System.out.println("O valor " + procurado + " nao esta presente no vetor");
    }
  }
}