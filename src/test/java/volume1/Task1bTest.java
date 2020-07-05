package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1bTest {

    @Test
    public void getFunctionTest() {
        assertEquals(3, Task1b.getFunction(1), 0.1);
    }
}
