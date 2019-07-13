package volume1;

import java.util.Scanner;

public class Task1_017j {


    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double I = q.nextInt();
        Scanner w = new Scanner (System.in);
        double R = w.nextInt();
        System.out.println("Relulst = "+getResult(I, R));

    }

    public static double getResult(double I, double R) {
        return I*I*R;
    }
}
