package volume3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static volume3.Chapter1Task2.isStringPermutationV1;

public class Chapter1Task2Test {

    @Test
    public void getPermutation() {
        assertTrue(isStringPermutationV1("говно", "гооно"));
    }
}