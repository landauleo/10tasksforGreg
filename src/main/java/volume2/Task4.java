package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1 = s.nextInt();
        double num2 = s.nextInt();
        double num3 = s.nextInt();
        double num4 = s.nextInt();
        double num5 = s.nextInt();
        System.out.println("Result: " + getArithmeticMean(num1, num2, num3, num4, num5));
    }

    public static double getArithmeticMean(double num1, double num2, double num3, double num4, double num5) {
        return (num1 + num2 + num3 + num4 + num5) / 5;
    }
}
