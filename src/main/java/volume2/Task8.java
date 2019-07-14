package volume2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 14:56
 */
public class Task8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        System.out.println("Result: " + getFibonacciNumber(n));
    }

    public static BigInteger getFibonacciNumber(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        for (int i = 2; i <= n.intValue(); ++i) {
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        return a;
    }
}
