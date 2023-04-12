package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointTest {
    @Test
    public void when00to02then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when100to50then5() {
        Point a = new Point(10, 0);
        Point b = new Point(5, 0);
        double expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when00to43then5() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 3);
        double expected = 5;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when1310to710then6() {
        Point a = new Point(13, 10);
        Point b = new Point(7, 10);
        double expected = 6;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when10197to378then84() {
        Point a = new Point(10, 19, 7);
        Point b = new Point(3, 7, 8);
        double rsl = a.distance(b);
        double expected = 13.9;
        assertThat(rsl).isCloseTo(expected, offset(0.01));
    }
}