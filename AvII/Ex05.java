public class Ex05 {
    public static void main(String[] args) {
        float[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;

        float media = 0;
        for (int i = 0; i < values.length; i++) {
            media += values[i];
        }
        media = media/10;

        float desvio = 1.0f/(n - 1);

        float somatorio = 0;
        for (int i = 0; i < values.length; i++) {
            somatorio = somatorio + (values[i] - media)*(values[i] - media);
        }

        desvio = desvio * somatorio;
        desvio = (float) Math.sqrt(desvio);
        System.out.println("Desvio " + desvio);

    }
}