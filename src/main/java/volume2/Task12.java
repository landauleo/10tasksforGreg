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

    public static String getSolutionOfQuadraticEquation(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double x1, x2;
        if (discriminant > 0) {
            x1 = ((-1) * b + Math.sqrt(discriminant)) / 2 * a;
            x2 = ((-1) * b - Math.sqrt(discriminant)) / 2 * a;
            return x1 + " и " + x2;
        } else if (discriminant == 0) {
            x1 = (-1) * b;
            return x1 + " и " + x1;
        } else {
            return "ничему, т.к. дискриминант меньше нуля";
        }
    }
}
