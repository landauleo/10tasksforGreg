package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task5Test {

    @Test
    public void getDiameterTest() {
        assertEquals( 10, Task5.getDiameter(5),  0.1);
    }
}
