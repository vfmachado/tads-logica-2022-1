import java.util.Scanner;

public class Exercicio01 {
    //MAIN => PRINCIPAL => PONTO DE PARTIDA DO PROGRAMA
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        int valor, antecessor;
        System.out.println("FUNCIONA!!!! ooOOooBAAA");  
        System.out.println("USUÁRIO, INFORME UM NUMERO");
        valor = teclado.nextInt();
        antecessor = valor - 1;
        System.out.println("O NUMERO INFORMADO FOI: " + valor);
        System.out.println("O ANTECESSOR DESTE NUMERO É: " + antecessor);
    }
}
