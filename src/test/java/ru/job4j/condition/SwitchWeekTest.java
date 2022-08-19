package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {

    @Test
    public void nameof1Day() {
        String expected = "Monday";
        int day = 1;
        String dayout = SwitchWeek.nameofDay(day);
        assertThat(dayout).isEqualTo(expected);
    }
}