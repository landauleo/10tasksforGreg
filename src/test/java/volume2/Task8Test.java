package volume2;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task8Test {

    @Test
    public void getResult() {
        assertEquals(BigInteger.valueOf(3), Task8.getFibonacciNumber(BigInteger.valueOf(5)));
    }
}
