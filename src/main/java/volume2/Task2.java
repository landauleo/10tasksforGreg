package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        System.out.println("Result: "+getResult(x));
    }

    public static double getResult(int x) {
        return Math.abs(x);
    }
}
