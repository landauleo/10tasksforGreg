package volume1;

import java.util.Scanner;

public class Task1_017h {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double a = q.nextInt();
        Scanner w = new Scanner (System.in);
        double b = w.nextInt();
        Scanner e = new Scanner (System.in);
        double c = e.nextInt();
        System.out.println("Relulst = "+getResult(a, b, c));

    }

    public static double getResult(double a, double b, double c) {
        return b*b - 4*a*c;
    }
}
