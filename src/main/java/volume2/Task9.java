package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task9 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();
        System.out.println("Result: " + getReversedString(n));
    }

    public static String getReversedString(String n) {
        return new StringBuffer(n).reverse().toString();
    }
}
