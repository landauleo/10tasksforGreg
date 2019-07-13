package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task8Test {

    @Test
    public void getResult() {
        assertEquals(3, Task8.getResult(5), 0.1);
    }
}
