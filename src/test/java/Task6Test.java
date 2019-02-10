import org.junit.Test;

import static org.junit.Assert.*;


public class Task6Test {

    @Test
    public void getVolume() {
        assertEquals( 27, Task6.getVolume(3),  0.1);
    }
    @Test
    public void getSquare() {
        assertEquals( 16, Task6.getSquare(2),  0.1);
    }
}
