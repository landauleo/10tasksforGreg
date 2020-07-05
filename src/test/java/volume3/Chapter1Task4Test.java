package volume3;

import org.junit.Assert;
import org.junit.Test;

import static volume3.Chapter1Task4.isPalindromePermutation;

public class Chapter1Task4Test {

    @Test
    public void getPalindromePermutation() {
        Assert.assertTrue(isPalindromePermutation("Tact coa"));
    }
}