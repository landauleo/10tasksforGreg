package volume2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task12Test {

    @Test
    public void getResult() {
        assertEquals(-8.0 + " и " + -56.0, Task12.getSolutionOfQuadraticEquation(4, 16, 7));
    }
}

