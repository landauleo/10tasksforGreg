package volume1;

import java.util.Scanner;

public class Task1_017c {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double V0 = s.nextInt();
        Scanner d = new Scanner (System.in);
        double t = d.nextInt();
        Scanner h = new Scanner (System.in);
        double a = h.nextInt();
        System.out.println("Relulst = "+getS(V0, t, a));

    }

    public static double getS(double V0, double t, double a) {
        return V0*t + (a*t*t)/2;
    }
}
