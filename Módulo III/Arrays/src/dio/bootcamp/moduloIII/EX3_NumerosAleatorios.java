package dio.bootcamp.moduloIII;


import java.util.Random;


public class EX3_NumerosAleatorios {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            System.out.println("\nNumero" + (i + 1) + " = " + numerosAleatorios[i]);

            for (int j = (i + 1); j < numerosAleatorios.length; j++) {
                System.out.print("Sucessor" + (j - i) + " = " + numerosAleatorios[j] + " | ");
            }
            System.out.println();

        }
    }
}
