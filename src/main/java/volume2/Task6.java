package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Result: " + getGreatestCommonDivisor(a, b));
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        int greatestCommonDivisor = 0;
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        greatestCommonDivisor = (a == 0) ? b : a;
        return greatestCommonDivisor;
    }
}
