package volume2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task13Test {

    @Test
    public void getResult() {
        int[] arr = {9, 99, 8, 88, 7, 77, 6, 66, 5, 55};
        int[] res = {5, 6, 7, 8, 9, 55, 66, 77, 88, 99};
        assertEquals(Arrays.toString(res), Arrays.toString(Task13.getSortedArray(arr)));
    }
}

