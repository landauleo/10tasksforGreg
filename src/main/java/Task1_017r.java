import java.util.Scanner;

public class Task1_017r {

    public static void main(String[] args) {
        Scanner u = new Scanner (System.in);
        double x = u.nextInt();
        System.out.println("Relulst = "+getResult(x));

    }

    public static double getResult(double x) {
        return Math.abs(1 - Math.abs(x));
    }
}
