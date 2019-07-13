package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task4 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();
        double d = s.nextInt();
        double e = s.nextInt();
        System.out.println("Result: "+getResult(a, b, c, d, e));
    }

    public static double getResult(double a, double b, double c, double d, double e) {
        return (a+b+c+d+e)/5;
    }
}
