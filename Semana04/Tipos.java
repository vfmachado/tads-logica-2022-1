public class Tipos {
    public static void main(String[] args) {
        System.out.println("TIPOS EM JAVA!!!");

        /*
        TODA  VARIAVEL TEM UM TIPO E UM NOME (APELIDO)
        TODA DECLARACAO DE VARIAVEL COMEÇA COM O TIPO E DEPOIS O SEU NOME
        */
        // int   => tipo
        // valor => nome
        // ;     => final da instruçao
        int valor;

        // DECLARACAO DE MULTIPLAS VARIAVEIS DO MESMO TIPO
        int valor2, valor3;

        // int É UTILIZADO PARA TIPOS INTEIROS
        // TIPO PRIMITIVO int
        // NAO PRIMITIVO Integer   
        System.out.println("MENOR valor inteiro possivel em JAVA: "
                                 + Integer.MIN_VALUE); 

        System.out.println("MAIOR valor inteiro possivel em JAVA: "
                                 + Integer.MAX_VALUE); 

        System.out.println("\n=========\nBYTE:");
        // EXISTEM VARIOS TIPOS PRIMITIVOS
        byte valorByte = 123;
        System.out.println("MENOR valor byte possivel em JAVA: "
                                 + Byte.MIN_VALUE); 

        System.out.println("MAIOR valor byte possivel em JAVA: "
                                 + Byte.MAX_VALUE); 

        System.out.println("\n=========\nSHORT:");
        // EXISTEM VARIOS TIPOS PRIMITIVOS
        short valorShort = 12;
        System.out.println("MENOR valor short possivel em JAVA: "
                                 + Short.MIN_VALUE); 

        System.out.println("MAIOR valor short possivel em JAVA: "
                                 + Short.MAX_VALUE); 

        // LONG
        System.out.println("\n=========\n LONG:");
        // EXISTEM VARIOS TIPOS PRIMITIVOS
        long valorlong = 121241245124125152L;
        System.out.println("MENOR valor long possivel em JAVA: "
                                 + Long.MIN_VALUE); 

        System.out.println("MAIOR valor long possivel em JAVA: "
                                 + Long.MAX_VALUE); 

        // E QUANDO PRECISAR DE UM NUMERO COM VIRGULA? =)
        // double => muita precisa
        // float  => ponto flutuante, numero virgula
        double muitasCasas = 1251.3981542147498;
        float oitoCasas = 1251.12345678f;   // colocar f no final para indicar que é tipo float

        // TIPOS PARA TEXTOS
        char letra = 'M';   // CHAR TRABALHO COM ASPAS SIMPLES
        String texto = "PQ \"ALGUEM\" QUIS SÃO ASPAS DUPLAS!!!";
        
        boolean boleano = true; // ou false
    }
}
