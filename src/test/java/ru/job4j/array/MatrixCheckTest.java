package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'x', 'x', 'x'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', 'a', ' '},
                {'a', 'b', 'c'}
        };
        int row = 1;
        boolean result = MatrixCheck.monoHorizontal(input, row);
        Assert.assertFalse(result);
    }

    @Test
    public void whenHesMonoVertical() {
        char[][] input = {
                {' ', ' ', 'x'},
                {' ', ' ', 'x'},
                {' ', ' ', 'x'}
        };
        int column = 2;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotHasMonoVertical() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {'a', 'b', 'c'}
        };
        int column = 1;
        boolean result = MatrixCheck.monoVertical(input, column);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDiagonalFullX() {
        char[][] input = {
                {'x', ' ', ' '},
                {' ', 'x', 'x'},
                {' ', ' ', 'x'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'x', 'x', 'x'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'x', ' ', ' '},
                {' ', 'y', ' '},
                {' ', ' ', 'z'}
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'x', 'y', 'z'};
        Assert.assertArrayEquals(expected, result);
    }
}