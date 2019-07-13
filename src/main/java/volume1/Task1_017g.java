package volume1;

import java.util.Scanner;

public class Task1_017g {

    public static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double r = q.nextInt();

        System.out.println("Relulst = "+getResult(r));

    }

    public static double getResult(double r) {
        return 2*r*PI;
    }
}
