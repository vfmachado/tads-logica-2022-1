public class Ex02 {
    public static void main(String[] args) {
        /*
         *  [ 1, 2, 3, 4, 5]
         *  girar 2x
         *  [ 4, 5, 1, 2, 3]
         */
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "  ");
        }
        System.out.println();

        // girar 3x
        System.out.println("GIRANDO 3x");

        int[] copia = new int[v.length]; 
        for (int i = 0; i < v.length; i++) {
            copia[ (i+3) % 10] = v[i];
        }

        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + "  ");
        }
        System.out.println();
        


        System.out.println("\n\nGIRANDO 25x");
        for (int i = 0; i < v.length; i++) {
            copia[ (i+25) % 10] = v[i];
        }
        

        for (int i = 0; i < copia.length; i++) {
            System.out.print(copia[i] + "  ");
        }
        System.out.println();
    }
}
