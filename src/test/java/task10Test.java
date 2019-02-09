import org.junit.Test;

import static org.junit.Assert.*;


public class task10Test {

    @Test
    public void getPerTest() {
        assertEquals(20 , task10.getPer(9, 5, 4), 0.1);
    }
}
