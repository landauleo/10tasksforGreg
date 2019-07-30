package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        System.out.println("Результат решения квадратного уравнения: x1 и x2 равны " + getSolutionOfQuadraticEquation(a, b, c));
    }

    public static MyResult getSolutionOfQuadraticEquation(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double x1;
        double x2;
        if (discriminant > 0) {
            x1 = ((-1) * b + Math.sqrt(discriminant)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(discriminant)) / 2 * a;
            return doResult(x1, x2);
        } else if (discriminant == 0) {
            x1 = (-1) * b;
            return doResult(x1, x1);
        } else {
            throw new ArithmeticException();
        }
    }

    final static class MyResult {
        private double first;
        private double second;

        public void setFirst(double first) {
            this.first = first;
        }

        public void setSecond(double second) {
            this.second = second;
        }

        public MyResult(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }

    public static MyResult doResult(double x1, double x2) {
        return new MyResult(x1, x2);
    }
}
