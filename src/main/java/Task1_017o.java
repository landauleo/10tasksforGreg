import java.util.Scanner;

public class Task1_017o {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double a = q.nextInt();
        Scanner w = new Scanner (System.in);
        double b = w.nextInt();
        Scanner e = new Scanner (System.in);
        double c = e.nextInt();
        Scanner u = new Scanner (System.in);
        double x = u.nextInt();
        System.out.println("Relulst = "+getResult(a, b, c, x));

    }

    public static double getResult(double a, double b, double c, double x) {
        return 1/(Math.sqrt(a*x*x+b*x+c));
    }
}
