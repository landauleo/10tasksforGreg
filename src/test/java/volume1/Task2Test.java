package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task2Test {

    @Test
    public void getFunctionTest() {
        assertEquals(6.8, Task2.getFunction(5), 0.1);
    }
}
