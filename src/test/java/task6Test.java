import org.junit.Test;

import static org.junit.Assert.*;


public class task6Test {

    @Test
    public void getVolume() {
        assertEquals( 27, task6.getVolume(3),  0.1);
    }
    @Test
    public void getSquare() {
        assertEquals( 16, task6.getSquare(2),  0.1);
    }
}
