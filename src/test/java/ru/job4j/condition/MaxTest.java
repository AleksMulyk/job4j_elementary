package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax150To100Then150() {
        int left = 150;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 150;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To100Then100() {
        int left = 1;
        int right = 100;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax15To15Then15() {
        int left = 15;
        int right = 15;
        int result = Max.max(left, right);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }
}