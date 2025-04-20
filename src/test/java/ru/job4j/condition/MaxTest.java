package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2Then1() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenOneIsEqualsTwo() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenThirdMax() {
        int left = 2;
        int right = 3;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenRightMax() {
        int left = 2;
        int right = 7;
        int third = 5;
        int result = Max.max(left, right, third);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenRightAndLeftDouble() {
        double left = 2.0;
        double right = 3.5;
        double result = Max.max(left, right);
        double expected = 3.5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeftDoubleAndRightInt() {
        double left = 4.6;
        int right = 2;
        double result = Max.max(left, right);
        double expected = 4.6;
        assertThat(result).isEqualTo(expected);
    }
}