package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task4Test {

    @Test
    public void getDestinationTest() {
        assertEquals( 5039.8, Task4.getDestination(2),  0.1);
    }
}
