public class TesteMetodos {
    public static void main(String[] args) {
        int valor = 14;
        int outroValor = 6;

        int resultado = Utils.soma(valor, outroValor);
        Utils.print(resultado);

        String nome = "Vinicius";
        String sobre = "Fritzen";
        System.out.println(Utils.fullname(nome, sobre));

        int dia = 14;
        int mes = 06;
        int ano = 1991;

        System.out.println(Utils.dataFormatada(dia, mes, ano, "pt-br"));
        System.out.println(Utils.dataFormatada(dia, mes, ano, "en-us"));
        System.out.println(Utils.dataFormatada(dia, mes, ano, "errada"));
    }
}
