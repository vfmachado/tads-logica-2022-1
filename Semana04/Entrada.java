// IMPORT => LISTA DE IMPORTACOES, COISAS PRONTAS QUE JÁ EXISTEM NO PACOTE DO JAVA E QUERO APROVEITAR NO MEU PROGRAMA
import java.util.Scanner; 

public class Entrada {
    public static void main(String[] args) {
        // DECLARACAO E INICIALIZACAO DO SCANNER
        // SYSTEM.IN => TECLADO
        Scanner in = new Scanner(System.in);
        // in É O NOME
        // PODERIA SER QUALQUER COISA

        // DECLARA UMA VARIAVEL
        // tipo nome
        // String = texto
        String nome;

        // int => numeros inteiros
        int idade;

        System.out.println("Qual seu nome?");
        // a variavel nome RECEBE o valor lido pelo scanner
        nome = in.next();  // leia a proxima palavra
        System.out.println("Bem vindo(a) " + nome);

        // println => texto + quebra linha
        // print => texto e mantem o cursor
        System.out.print("\n\tIdade: ");
        idade = in.nextInt();   // sempre acompanha o tipo da variavel

        int anoNascimento = 2022 - idade;
        System.out.println("poxaaa, que legal, vc nasceu em " + anoNascimento);
    }
}
