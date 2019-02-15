import java.util.Scanner;

public class Task1_017q {

    public static void main(String[] args) {
        Scanner u = new Scanner (System.in);
        double x = u.nextInt();
        System.out.println("Relulst = "+getResult(x));

    }

    public static double getResult(double x) {
        return Math.abs(x) + Math.abs(x+1);
    }
}
