package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task3Test {

    @Test
    public void getPerimeterTest() {
        assertEquals(16, Task3.getPerimeter(4), 0.1);
    }
}
