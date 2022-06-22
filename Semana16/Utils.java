import java.util.Random;

public class Utils {
    
    // METODO
    // PUBLIC => OUTRAS CLASSES PODEM VE-LO
    // STATIC => OUTRAS CLASSES CHAMAM UTILS.SOMA (DIRETAMENTE)
    //           O METODO, SEM PRECISAR INSTANCIAR A CLASSE.
    // INT => RETORNO DESTE METODO
    //      ** VOID => SEM RETORNO
    // NOME => LIVRE, EXCETO PALAVRAS RESERVADAS, OBRIGATORIAMENTE COMEÇAR COM UMA LETRA
    // PARAMETROS => OPCIONAIS, SEPARADOS POR VIRGULA, COM TIPO E NOME
    public static int soma(int a, int b) {
        int total = a + b;
        return total;
    }

    public static void print(int a) {
        System.out.println(a);
    }
    
    public static String fullname(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

    public static String dataFormatada(int dia, int mes, int ano, String padrao) {
        if (padrao.equals("pt-br")) {
            return String.format("%d/%d/%d", dia, mes, ano);
        } else if (padrao.equals("en-us")) {
            return String.format("%d/%d/%d", mes, dia, ano);
        } else {
            return String.format("%d de %d de %d", dia, mes, ano);
        }
    }

    public static void mostrarVetor(int[] vetor) {
        mostrarVetor(vetor, "vetor");
    } 

    public static void mostrarVetor(int[] vetor, String apelido) {
        System.out.print(apelido +  " = [ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static int[] popularVetor(int[] v, int limite) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++) {
            v[i] = r.nextInt(limite);
        }
        return v;
    }

}
