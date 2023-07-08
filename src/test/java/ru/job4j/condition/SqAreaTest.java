package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP5K1Square1dot56 () {
        double expected = 1.56;
        int p = 5;
        double k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP4K2Square0dot88 () {
        double expected = 0.88;
        int p = 4;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP8K2Square3dot55() {
        double expected = 3.55;
        int p = 8;
        int k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenP7K1Square3dot06() {
        double expected = 3.06;
        int p = 7;
        int k = 1;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}