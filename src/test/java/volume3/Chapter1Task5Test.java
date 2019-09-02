package volume3;

import org.junit.Assert;
import org.junit.Test;

import static volume3.Chapter1Task5.areStringsOneEdit;

public class Chapter1Task5Test {

    @Test
    public void getOneEdit() {
        Assert.assertTrue(areStringsOneEdit("pale", "bale"));
    }
}