package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PointTest {

    @Test
    public void when00to20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void when00to30Then3() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 3);
        double expected = 3;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void when00to34Then5() {
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double expected = 5;
        assertThat(expected, is(a.distance(b)));
    }

    @Test
    public void when00to22then2dot83() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);
        double expected = 2.83;
        assertThat(expected, is(a.distance(b)));
    }
}