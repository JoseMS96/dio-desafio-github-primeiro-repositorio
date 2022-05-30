package dio.bootcamp.ModuloIII;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EX1_List {
    public static void main(String[] args) {

        List<temperatura> temperaturas = new ArrayList<>(){{
            add(new temperatura(10.5, "Janeiro"));
            add(new temperatura(30.1, "Fevereiro"));
            add(new temperatura(22.3, "Março"));
            add(new temperatura(-1.3, "Abril"));
            add(new temperatura(33.5, "Maio"));
            add(new temperatura(14.5, "Junho"));
        }};

        double sum = 0d;
        Iterator<temperatura> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next().temperatura;
            sum += next;
        }

        double media = (sum / temperaturas.size());
        System.out.println("Media = " + media);

        Iterator<temperatura> iterator2 = temperaturas.iterator();
        while(iterator2.hasNext()) {
            Double next = iterator2.next().temperatura;
            if (next >= media)
                System.out.println(iterator2.next());
        }

    }
}

class temperatura {
    double temperatura;
    String mes;

    public temperatura(double temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "temperatura{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }
}
