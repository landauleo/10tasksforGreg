package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task10Test {

    @Test
    public void getPerimeterTest() {
        assertEquals(20 , Task10.getPerimeter(9, 5, 4), 0.1);
    }
}
