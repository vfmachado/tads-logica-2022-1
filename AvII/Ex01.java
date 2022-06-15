public class Ex01 {
    public static void main(String[] args) {
        int n = 5;
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {1, 2, 3, 4, 5};

        boolean iguais = true;
        for (int i = 0; i < v2.length; i++) {
            if (v1[i] != v2[i]) {
                iguais = false;
                System.out.println("Diferentes na posicao " + i);
            }
        }

        if (iguais) System.out.println("Ambos vetores são iguais");
    }
}
