package volume2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger a = s.nextBigInteger();
        System.out.println("Result: " + getFactorial(a));
    }

    public static int getFactorial(BigInteger a) {
        int result = 1;
        for (int i = 1; i <= a.intValue(); i++) {
            result = result * i;
        }
        return result;
    }
}
