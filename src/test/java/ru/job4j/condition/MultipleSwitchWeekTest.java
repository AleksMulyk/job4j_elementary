package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whennumberofDayMondayen() {
        int expected = 1;
        String numberofDayMonday = "Monday";
        int rsl = MultipleSwitchWeek.numberofDay("Monday");
    }

    @Test
    public void whennumberofDayMondayru() {
        int expected = 1;
        String numberofDayMonday = "Понедельник";
        int rsl = MultipleSwitchWeek.numberofDay("Понедельник");
    }
}