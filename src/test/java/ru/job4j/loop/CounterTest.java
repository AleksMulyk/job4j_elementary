package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    public void sum() {
        int excepted = 55;
        int rsl = Counter.sum(0, 10);
        assertThat(rsl).isEqualTo(excepted);
    }
    }
