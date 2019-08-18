package volume3;

import org.junit.Assert;
import org.junit.Test;

import static volume3.Chapter1Task3.arr;
import static volume3.Chapter1Task3.replaceSpacesV3;

public class Chapter1Task3Test {

    @Test
    public void getReplacement() {
        Assert.assertEquals("Gre%20%20g", replaceSpacesV3(arr));
    }
}