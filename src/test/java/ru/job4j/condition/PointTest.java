package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        double out = x.distance(y);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when20to02then2dot82() {
        double expected = 2.82;
        Point x = new Point(2, 0);
        Point y = new Point(0, 2);
        double out = x.distance(y);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when22to02then2() {
        double expected = 2;
        Point x = new Point(2, 0);
        Point y = new Point(2, 2);
        double out = x.distance(y);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when127to22then11dot18() {
        double expected = 11.18;
        Point x = new Point(12, 7);
        Point y = new Point(2, 2);
        double out = x.distance(y);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void when23to32then1dot41() {
        double expected = 1.41;
        Point x = new Point(2, 3);
        Point y = new Point(3, 2);
        double out = x.distance(y);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}