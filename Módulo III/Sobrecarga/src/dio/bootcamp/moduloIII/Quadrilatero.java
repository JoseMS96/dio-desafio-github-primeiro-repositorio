package dio.bootcamp.moduloIII;

public class Quadrilatero {

    public void area(double altura) {
        double area = altura * altura;
        System.out.println(area);
    }

    public void  area(double altura, double largura) {
        double area = altura * largura;
        System.out.println(area);
    }

    public static double area(double altura, double basemenor, double basemaior) {
        double area = (basemenor + basemaior) * altura / 2;
        return area;
    }

}
