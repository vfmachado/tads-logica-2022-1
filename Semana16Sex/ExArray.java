import java.util.ArrayList;

public class ExArray {
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());

        names.add("Vinicius");
        names.add("Pablo");
        names.add("Lucas");

        System.out.println(names.size());
        System.out.println(names);

        System.out.println("Vinicius na posicao " + names.indexOf("Vinicius"));
        System.out.println("Fernando na posicao " + names.indexOf("Fernando"));

        System.out.println("Na posicao 1 tem o " + names.get(1));

        System.out.println("se eu remover quem esta na posicao");
        System.out.println("agora na posicao 1 tem o valor");
        names.remove("Pablo");
        System.out.println(names.get(1));
        System.out.println(names.size());
    }
}