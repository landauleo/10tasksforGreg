package volume2;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * User: Anna Nosova
 * Time: 2019-07-13 15:05
 */
public class Task12Test {
    @Rule
    public ExpectedException expectedException =  ExpectedException.none();

    @Test
    public void getResult() {

        expectedException.expect(ArithmeticException.class); //lol
        Task12.getSolutionOfQuadraticEquation(5, 3, 7);
    }
}

