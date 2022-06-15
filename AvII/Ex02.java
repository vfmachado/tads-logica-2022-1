public class Ex02 {
    public static void main(String[] args) {
        int v1[] = {1, 2, 3, 4, 5};
        int v2[] = {1, 2, 6};
        boolean subconjunto = true;

        for (int i = 0; i < v2.length; i++) {
            boolean presente = false;
            for (int j = 0; j < v1.length; j++) {
                if (v2[i] == v1[j]) {
                    presente = true;
                    break;
                }
            }
            if (!presente) {
                subconjunto = false;
            }
        }

        if (subconjunto) System.out.println("eh subconjunto");
        else System.out.println("nao eh subconjunto");
    }
}
