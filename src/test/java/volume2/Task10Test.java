package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task10Test {

    @Test
    public void getResult() {
        assertEquals(5+5, Task10.getConsonantNumber("annanosova"), Task10.getVowelsNumber("annanosova"));
    }
}
