package volume1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Task7Test {

    @Test
    public void getDensityTest() {
        assertEquals( 30, Task7.getDensity(5, 6),  0.1);
    }
}
