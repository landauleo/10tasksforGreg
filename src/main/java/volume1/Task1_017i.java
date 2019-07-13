package volume1;

import java.util.Scanner;

public class Task1_017i {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double epsilon = q.nextInt();
        Scanner w = new Scanner (System.in);
        double m1 = w.nextInt();
        Scanner e = new Scanner (System.in);
        double m2 = e.nextInt();
        Scanner t = new Scanner (System.in);
        double r = t.nextInt();
        System.out.println("Relulst = "+getResult(epsilon, m1, m2, r));

    }

    public static double getResult(double epsilon, double m1, double m2, double r) {
        return epsilon*(m1*m2/(r*r));
    }
}
