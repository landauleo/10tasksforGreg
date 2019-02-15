import java.util.Scanner;

public class Task1_017n {

    public static void main(String[] args) {
        Scanner q = new Scanner (System.in);
        double x = q.nextInt();
        System.out.println("Relulst = "+getResult(x));

    }

    public static double getResult(double a) {
        return Math.sqrt(1 - (1 - Math.cos(a*a))/2);
    }
}
