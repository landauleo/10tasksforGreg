package volume2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task14Test {

    @Test
    public void getResult() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertEquals(2, Task14.getNumber(list, 3));
    }
}

