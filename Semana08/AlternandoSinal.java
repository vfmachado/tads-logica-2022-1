public class AlternandoSinal {
    public static void main(String[] args) {
        int n = 10;

        // impares são os denominadores
        // a cada fracao alterna o sinal

        int denominador = 1;
        int sinal = 1;

        while (n > 0) {
            if (n % 2 == 1)
                System.out.println("1 / "  + denominador);
            else
                System.out.println(" - 1 / "  + denominador);
            
            denominador = denominador + 2;
            n--;
        }

    }
}
