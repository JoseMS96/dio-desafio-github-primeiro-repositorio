package dio.bootcamp.ModuloIII;

import java.util.*;


public class EX1_Map {
    public static void main(String[] args) {

        Map<String, Integer> estadosNE = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};

        estadosNE.put("RN", 3534165);

        System.out.println();
        System.out.println("O estado de PB está no mapa? " + estadosNE.containsKey("PB"));

        estadosNE.put("PB", 4039277);

        Map<String, Integer> estadosNELINKED = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println();
        System.out.println(estadosNELINKED);

        Map<String, Integer> estadosNETREE = new TreeMap<>(estadosNE);
        System.out.println();
        System.out.println(estadosNETREE);

        Integer menorPopulacao = Collections.min(estadosNE.values());
        Set<Map.Entry<String, Integer>> entries = estadosNE.entrySet();
        String estadoComMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue() == menorPopulacao) {
                estadoComMenorPopulacao = entry.getKey();
            }
        }
        System.out.println();
        System.out.println(estadoComMenorPopulacao + " - " + menorPopulacao);

        Integer maiorPopulacao = Collections.max(estadosNE.values());
        Set<Map.Entry<String, Integer>> entries2 = estadosNE.entrySet();
        String estadoComMaiorPopulacao = "";
        for (Map.Entry<String, Integer> entry: entries) {
            if (entry.getValue() == maiorPopulacao) {
                estadoComMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println();
        System.out.println(estadoComMaiorPopulacao + " - " + maiorPopulacao);

        Integer sum = 0;
        Iterator<Integer> iterator1 = estadosNE.values().iterator();
        while(iterator1.hasNext()) {
            sum += iterator1.next();
        }
        System.out.println();
        System.out.println("Soma das populações: " + sum);

        System.out.println();
        System.out.println("Média de população: " + sum/estadosNE.size());

        iterator1 = estadosNE.values().iterator();
        while(iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println();
        System.out.println(estadosNE);

        estadosNE.clear();

        System.out.println();
        System.out.println("O mapa está vazio? " + estadosNE.isEmpty());

    }
}
