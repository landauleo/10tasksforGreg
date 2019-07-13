package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task3Test {

    @Test
    public void getResult() {
        assertEquals(4, Task3.getResult(1, 3), 0.1);
    }
}
