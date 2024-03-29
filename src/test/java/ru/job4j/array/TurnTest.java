package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 7};
        int[] result = Turn.back(input);
        int[] expected = new int[] {7, 2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

        /*
            �������� ����� ����, ����������� ��������� �������
            � �������� ������ ���������, �������� {1, 2, 3, 4, 5}.
         */
}