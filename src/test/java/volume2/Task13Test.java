package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task13Test {

    @Test
    public void getResult() {
        int[] arr = {9, 99, 8, 88, 7, 77, 6, 66, 5, 55};
        assertEquals("[5, 6, 7, 8, 9, 55, 66, 77, 88, 99]", Task13.getSortedArray(arr));
    }
}

