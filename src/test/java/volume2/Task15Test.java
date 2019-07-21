package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task15Test {

    @Test
    public void getResult() {
        assertEquals("Ты угадал, умничка", Task15.guessNumber(65));
    }
}

