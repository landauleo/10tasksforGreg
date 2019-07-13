package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1_017iTest {
    @Test
    public void getResult() {
        assertEquals(0.75, Task1_017i.getResult(2, 4, 6, 8), 0.1);
    }
}
