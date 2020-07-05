package volume3;

import org.junit.Assert;
import org.junit.Test;

import static volume3.Chapter1Task6.compressString;

public class Chapter1Task6Test {

    @Test
    public void getCompression() {
        Assert.assertEquals("х5у2и1",compressString("хххххууи"));
    }
}