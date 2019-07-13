package volume1;

import java.util.Scanner;

public class Task1_017a {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double x = s.nextInt();
        System.out.println("Relulst = "+getSquareRoot(x));
    }

    public static double getSquareRoot(double x) {
        return Math.sqrt(x*x + x*x);
    }
}
