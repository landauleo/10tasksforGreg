package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println("Result: " + getTheAbsoluteValue(number));
    }

    public static double getTheAbsoluteValue(int number) {
        return Math.abs(number);
    }
}
