package dio.bootcamp.moduloIII;

public class Main {

    public static void main(String[] args) {

        Quadrilatero quadrilatero1 = new Quadrilatero();

        double altura = 3;
        quadrilatero1.area(altura);
        quadrilatero1.area(altura, 3);

        double area = Quadrilatero.area(altura, 3, 5);
        System.out.println(area);

    }

}