package volume1;

import java.util.Scanner;

public class Task1_017p {

    public static void main(String[] args) {
        Scanner u = new Scanner (System.in);
        double x = u.nextInt();
        System.out.println("Relulst = "+getResult(x));

    }

    public static double getResult(double x) {
        return (Math.sqrt(x+1)+Math.sqrt(x-1)/2*Math.sqrt(x));
    }
}
