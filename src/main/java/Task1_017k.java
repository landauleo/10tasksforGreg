import java.util.Scanner;

public class Task1_017k {


    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double a = q.nextInt();
        Scanner w = new Scanner (System.in);
        double b = w.nextInt();
        Scanner e = new Scanner (System.in);
        double c = e.nextInt();
        System.out.println("Relulst = "+getResult(a, b, c));

    }

    public static double getResult(double a, double b, double c) {
        return a*b*Math.sin(c);
    }
}
