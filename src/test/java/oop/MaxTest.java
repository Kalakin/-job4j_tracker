package oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To7Then() {
        int result = Max.max(3, 4, 6, 7);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}



