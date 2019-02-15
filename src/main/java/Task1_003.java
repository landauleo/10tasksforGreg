import java.util.Scanner;

public class Task1_003 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        System.out.println("Вы вели число "+getInteger(x));
    }

    public static double getInteger(int x) {
        return x;
    }
}
