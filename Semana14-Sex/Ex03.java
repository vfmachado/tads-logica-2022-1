public class Ex03 {
    public static void main(String[] args) {
        
        int[] anterior = { 1 };
        int[] proximo;
        
        int N = 10;

        for (int linha = 0; linha < N; linha++) {
            
            for (int i = 0; i < anterior.length; i++) {
                System.out.print(anterior[i] + "  ");
            }
            System.out.println();

            proximo = new int[anterior.length + 1];   
            proximo[0] = 1;
            proximo[proximo.length -1] = 1;

            for (int i = 1; i < proximo.length -1; i++) {
                proximo[i] = anterior[i-1] + anterior[i];
            }

            anterior = proximo;
        }         

    }
}
