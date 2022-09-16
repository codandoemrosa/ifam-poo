import java.lang.Math;

public class Triangulo {

        int ladoA;
        int ladoB;
        int ladoC;

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
}
