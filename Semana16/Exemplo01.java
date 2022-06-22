import java.util.Scanner;

import javax.rmi.CORBA.Util;

public class Exemplo01 {

    public static void mostraVetor() {
        System.out.println("AINDA NAO EH UM VETOR, MAS UM TESTE");
    }

    public static void main(String[] args) {
        
        int[] v1 = {1, 2, 3, 4, 5, 6};
        int[] v2 = {3, 4, 5, 6, 7, 8, 9};
        Scanner in = new Scanner(System.in);

        mostraVetor();
        outroMetodo();

        System.out.println("MOSTRAR V1 E V2");
        Utils.mostrarVetor(v1, "v1");
        // Utils.mostrarVetor(v2);

        System.out.println("Populando v1 novamente");
        Utils.popularVetor(v1, 61);
        Utils.mostrarVetor(v1);


    }

    public static void outroMetodo() {
        System.out.println("Declarado depois.");
    }
}