package volume1;

import java.util.Scanner;

public class Task1_017m {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double a = q.nextInt();
        Scanner w = new Scanner (System.in);
        double b = w.nextInt();
        Scanner e = new Scanner (System.in);
        double c = e.nextInt();
        Scanner t = new Scanner (System.in);
        double d = t.nextInt();
        System.out.println("Relulst = "+getResult(a, b, c, d));

    }

    public static double getResult(double a, double b, double c, double d) {
        return (a*d+b*c)/a*d;
    }
}
