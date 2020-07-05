package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task9Test {

    @Test
    public void getPerimeterTest() {
        assertEquals( 6, Task9.getPerimeter(1, 2),  0.1);
    }
}
