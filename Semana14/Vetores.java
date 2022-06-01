import java.util.Random;

public class Vetores {
    public static void main(String[] args) {
        // CRIAR UM VETOR 
        // COM 20 VALORES ALEATORIOS (0-10)
        int[] valores = new int[20];
        Random aleat = new Random();
    
        for (int i = 0; i < valores.length; i++) {
            System.out.println("VALOR de i " + i);
            valores[i] = aleat.nextInt(11);
            System.out.println("FOI sorteado para esta posicoa o valor " + valores[i]);
        }

        // MOSTRAR O VETOR
        System.out.println("MEU VETOR: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "    ");
        }
        System.out.println();
        
        // ORDENAR O VETOR 
        int posAtual = 0;
        int comparador = 1;
        
        for (posAtual = 0; posAtual < valores.length -1; posAtual++) {
            for (comparador = posAtual +1; comparador < valores.length; comparador++) {

                if (valores[posAtual] > valores[comparador]) {
                    // troca
                    int aux = valores[posAtual];
                    valores[posAtual] = valores[comparador];
                    valores[comparador] = aux;

                }
           }

           System.out.println("\nPOSATUAL " + posAtual);
           System.out.println("MEU VETOR: ");
            for (int i = 0; i < valores.length; i++) {
                System.out.print(valores[i] + "    ");
            }
            System.out.println();
       }
        

        // CALCULAR A MEDIANA DO VETOR
        
        // SE A MEDIANA SEJA >= 6, MOSTRAR A PALAVRA SORTE
        
        // SE < 6, MOSTRAR A PALAVRA SEM SORTE

    }
}