package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1_017oTest {
    @Test
    public void getResult() {
        assertEquals(0.077, Task1_017o.getResult(2, 4, 6, 8), 0.1);
    }
}
