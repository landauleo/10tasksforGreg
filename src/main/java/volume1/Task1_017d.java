package volume1;

import java.util.Scanner;

public class Task1_017d {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double R1 = s.nextInt();
        Scanner d = new Scanner (System.in);
        double R2 = d.nextInt();
        System.out.println("Relulst = "+getResult(R1,R2));

    }

    public static double getResult(double R1, double R2) {
        return 1/R1 + 1/R2;
    }
}
