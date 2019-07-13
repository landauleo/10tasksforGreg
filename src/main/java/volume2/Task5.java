package volume2;

import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task5 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        double x = s.nextInt();
        char operation = s.next().charAt(0);
        double y = s.nextInt();
        System.out.println("Result: "+getResult(x, operation, y));
    }

    public static double getResult(double x, char operation, double y) {
        switch (operation) {
            case ('+'): return x+y;
            case ('-'): return x-y;
            case ('/'): return x/y;
            case ('*'): return x*y;
            case ('^'): return Math.pow(x, y);
            default: return 0;
        }
    }
}
