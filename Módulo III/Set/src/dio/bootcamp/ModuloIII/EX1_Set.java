package dio.bootcamp.ModuloIII;

import java.sql.SQLOutput;
import java.util.*;

public class EX1_Set {
    public static void main(String[] args) {

        Set<String> coresDoArcoIris = new HashSet<>();
        coresDoArcoIris.add("Vermelho");
        coresDoArcoIris.add("Laranja");
        coresDoArcoIris.add("Amarelo");
        coresDoArcoIris.add("Verde");
        coresDoArcoIris.add("Azul");
        coresDoArcoIris.add("Anil");
        coresDoArcoIris.add("Violeta");

        System.out.println("Uma cor abaixo da outra: ");
        Iterator<String> iterator1 =  coresDoArcoIris.iterator();
        while(iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println();
        System.out.println("Quantia de cores:" + coresDoArcoIris.size());

        System.out.println();
        System.out.println("Ordem alfabética: ");
        Set<String> treeCoresDoArcoIris = new TreeSet<>(coresDoArcoIris);
        System.out.println(treeCoresDoArcoIris);

        System.out.println();
        System.out.println("Ordem Reversa: ");
        List<String> coresList = new ArrayList<>(treeCoresDoArcoIris);
        Collections.reverse(coresList);
        System.out.println(coresList);

        System.out.println();
        System.out.println("Todas as cores que começam com a letra V: ");
        for (String cor: coresDoArcoIris) {
            if(cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        iterator1 = coresDoArcoIris.iterator();
        while (iterator1.hasNext()) {
            if (!iterator1.next().startsWith("V")) iterator1.remove();
        }
        System.out.println();
        System.out.println("Todos elementos que não começam com V removidos: " + "\n" + coresDoArcoIris);

        coresDoArcoIris.clear();

        System.out.println();
        System.out.println("Está vazio? " + coresDoArcoIris.isEmpty());


    }

}
