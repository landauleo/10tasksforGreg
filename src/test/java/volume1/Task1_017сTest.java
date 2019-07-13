package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1_017сTest {
    @Test
    public void getS() {
        assertEquals(24, Task1_017c.getS(2, 3, 4), 0.1);
    }
}
