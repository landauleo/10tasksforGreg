package volume3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static volume3.Chapter1Task1.areCharsUnique;

public class Chapter1Task1Test {

    @Test
    public void getUniquenessOfChars() {
        assertEquals(false, areCharsUnique("abrakadabra"));
    }
}