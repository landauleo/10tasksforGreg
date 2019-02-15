import java.util.Scanner;

public class Task1_017f {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double m = q.nextInt();
        Scanner w = new Scanner (System.in);
        double g = w.nextInt();
        Scanner e = new Scanner (System.in);
        double alpha = e.nextInt();
        System.out.println("Relulst = "+getResult(m,g, alpha));

    }

    public static double getResult(double m, double g, double alpha) {
        return m*g*Math.cos(alpha);
    }
}
