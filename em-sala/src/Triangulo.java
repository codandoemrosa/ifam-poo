import java.lang.Math;

public class Triangulo {

        double ladoA;
        double ladoB;
        double ladoC;

        Triangulo(){
            System.out.println("Triângulo()");
            ladoA = 3;
            ladoB = 4;
            ladoC = 5;
        }

        Triangulo(int a, int b, int c){
            System.out.println("Triângulo(int)");
            ladoA = a;
            ladoB = b;
            ladoC = c;
        }

        Triangulo(double a, double b, double c){
            System.out.println("Triângulo(double)");
            ladoA = a;
            ladoB = b;
            ladoC = c;
        }

        public double area() {
            double p = perimetro() / 2;
            return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        }

        public double perimetro(){
            return ladoA + ladoB + ladoC;
        }

        public double anguloAlfa() {
            double cosAlfa = (Math.pow(ladoB, 2) + Math.pow(ladoC, 2) - Math.pow(ladoA, 2)) / (2 * ladoB * ladoC);
            double alfa = Math.acos(cosAlfa);
            return Math.toDegrees(alfa);
        }

        public double anguloBeta(){
            double cosBeta = (Math.pow(ladoA, 2) + Math.pow(ladoC, 2) - Math.pow(ladoB, 2)) / (2 * ladoA * ladoC);
            double beta = Math.acos(cosBeta);
            return Math.toDegrees(beta);
        }

        public double anguloGama(){
            double cosGama = (Math.pow(ladoA, 2) + Math.pow(ladoB, 2) - Math.pow(ladoC, 2)) / (2 * ladoA * ladoB);
            double gama = Math.acos(cosGama);
            return Math.toDegrees(gama);
        }

        public void mostrar(){

            System.out.printf(" a = %f.2\n b = %f.2\n c = %f.2\n", ladoA, ladoB, ladoC);
            System.out.println("\n---------- Cálculos ----------");

            System.out.printf("Perímetro = %f\n", perimetro());
            System.out.printf("Area = %f\n", area());
            System.out.printf("Alfa = %f\n", anguloAlfa());
            System.out.printf("Beta = %f\n", anguloBeta());
            System.out.printf("Gama = %f\n", anguloGama());
        }
}
