import org.junit.Test;

import static org.junit.Assert.*;


public class Task8Test {

    @Test
    public void getHypotenuseTest()
    {
        assertEquals( 3, Task8.getHypotenuse(1, 2),  0.1);
    }
}
