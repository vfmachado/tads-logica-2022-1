public class RepetBasica {
    public static void main(String[] args) {
        
        /*

        MOSTRAR OS VALORES DE 50 A 40
        
        MOSTRAR PARES DE 1 A 20
        
        MOSTRAR IMPARES DE 100 A 80

        MOSTRAR VALORES MULTIPLOS DE 3 ENTRE 50 E 70

        */
        int valor;

        System.out.println("MOSTRAR VALORES DE 10 A 20");
        valor = 10;
        while (valor <= 20) {
            System.out.println(valor);
            valor = valor + 1;
        }

        System.out.println("\n\nMOSTRAR OS VALORES DE 50 A 40");
        valor = 50;
        while (valor >= 40) {
            System.out.println(valor);
            valor = valor - 1;
        }
        
        System.out.println("\n\nMOSTRAR PARES DE 1 A 20");
        valor = 2;
        while (valor <= 20) {
            /*
            // % => operador de resto de uma divisao
            if (valor % 2 == 0)
                System.out.println(valor);
            valor = valor + 1;
            */
            System.out.println(valor);
            valor += 2;     // valor = valor + 2
        }

    }
}
