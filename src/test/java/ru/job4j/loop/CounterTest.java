package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumNumbersFrom0To5() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumberFrom0To10() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumberFrom3To8() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumberFrom1To1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumberFrom0To5() {
        int start = 0;
        int finish = 5;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumberFrom0To10() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumberFrom3To8() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumberFrom1To1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}