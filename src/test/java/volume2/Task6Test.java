package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task6Test {

    @Test
    public void getResult() {
        assertEquals(3, Task6.getGreatestCommonDivisor(3, 9), 0.1);
    }
}
