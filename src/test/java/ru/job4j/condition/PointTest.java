package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when00to30Then3() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double expected = 3;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when00to34Then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double expected = 5;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when00to22then2dot83() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.83;
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when000to222then3dot46() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 2, 2);
        double expected = 3.46;
        double result = a.distance3d(b);
        Assert.assertEquals(expected, result, 0.01);
    }
}