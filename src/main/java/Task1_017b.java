import java.util.Scanner;

public class Task1_017b {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double x1 = s.nextInt();
        Scanner d = new Scanner (System.in);
        double x2 = d.nextInt();
        Scanner a = new Scanner (System.in);
        double x3 = a.nextInt();
        System.out.println("Relulst = "+getSum(x1, x2, x3));
    }

    public static double getSum(double x1, double x2, double x3) {
        return x1*x2+x2*x3+x1*x3;
    }
}
