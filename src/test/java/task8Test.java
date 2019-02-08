import org.junit.Test;

import static org.junit.Assert.*;


public class task8Test {

    @Test
    public void getHypTest()
    {
        assertEquals( 3, task8.getHyp(1, 2),  0.1);
    }
}
