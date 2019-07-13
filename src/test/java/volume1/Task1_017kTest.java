package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task1_017kTest {
    @Test
    public void getResult() {
        assertEquals(7.41, Task1_017k.getResult(3, 6, 9), 0.1);
    }
}
