package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1aTest {

    @Test
    public void getFunctionTest() {
        assertEquals( 10, Task1a.getFunction(1),  0.1);
    }
}
