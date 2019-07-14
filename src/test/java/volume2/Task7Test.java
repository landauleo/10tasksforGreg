package volume2;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task7Test {

    @Test
    public void getResult() {
        assertEquals(120, Task7.getFactorial(BigInteger.valueOf(5)), 0.1);
    }
}
