public class Ex02 {
    public static void main(String[] args) {
        int[] valores = {1, 2, 0, 4, 0, 0, 0, 7, 8, 10};
        // 1, 2, 4, 7, 8, 10, 0, 0, 0 ,0

        int[] resposta = new int[valores.length];

        int apontador = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] != 0) {
                resposta[apontador] = valores[i];
                apontador++;
            }
        }

        for (int i = 0; i < resposta.length; i++) {
            System.out.print(resposta[i] + "  ");
        }
        System.out.println();
    }
}
