import java.util.Scanner;

public class Task1_017e {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double m = q.nextInt();
        Scanner w = new Scanner (System.in);
        double v = w.nextInt();
        Scanner e = new Scanner (System.in);
        double g = e.nextInt();
        Scanner r = new Scanner (System.in);
        double h = r.nextInt();
        System.out.println("Relulst = "+getResult(m, v, g, h));

    }

    public static double getResult(double m, double v, double g, double h) {
        return m*v*v/2+m*g*h;
    }
}
