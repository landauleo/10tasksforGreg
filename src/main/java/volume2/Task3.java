package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("Result: "+getResult(x, y));
    }

    public static double getResult(int x, int y) {
        return x+y;
    }
}
