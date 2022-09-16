public class Poligonos {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo();
        t1.mostrar();
        System.out.println("-----------------------------");
        System.out.println();

        Triangulo t2 = new Triangulo(8, 10, 7);
        t2.mostrar();
        System.out.println("-----------------------------");
        System.out.println();

        Triangulo t3 = new Triangulo(3.0, 4.0, 5.0);
        t3.mostrar();
        System.out.println("-----------------------------");
        System.out.println();

        double areaTotalTriangulos = t1.area() + t2.area() + t3.area();
        System.out.println("Área total dos triângulos = " + areaTotalTriangulos);
    }
}
