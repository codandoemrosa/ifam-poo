public class Poligonos {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();

        System.out.printf("Perímetro = %f\n", t.perimetro());
        System.out.printf("Area = %f\n", t.area());
        System.out.printf("Alfa = %f\n", t.anguloAlfa());
        System.out.printf("Beta = %f\n", t.anguloBeta());
        System.out.printf("Gama = %f\n", t.anguloGama());

    }
}
