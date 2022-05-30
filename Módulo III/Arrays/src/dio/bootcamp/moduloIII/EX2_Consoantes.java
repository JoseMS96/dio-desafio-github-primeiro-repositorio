package dio.bootcamp.moduloIII;

import java.util.Scanner;

public class EX2_Consoantes {
    public static void main(String[] args) {

        Scanner scannner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeDeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scannner.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))) {

                consoantes[count] = letra;
                quantidadeDeConsoantes += 1;

            }

            count++;

        } while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println();
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);

    }
}
