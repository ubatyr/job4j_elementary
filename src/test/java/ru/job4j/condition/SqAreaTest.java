package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K2Square1dot39() {
        double p = 5;
        double k = 2;
        double expected = 1.39;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K3Square1dot69() {
        double p = 6;
        double k = 3;
        double expected = 1.69;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}