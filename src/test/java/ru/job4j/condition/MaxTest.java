package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax7To5To9Then9() {
        int a = 7;
        int b = 5;
        int c = 9;
        int result = Max.max(a, b, c);
        int expected = 9;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To4To5To2Then5() {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }
}
