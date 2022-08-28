package ru.job4j.array;

public class SortSelected {

    /* 1) MinDiapason.findMin - метод определяет минимальное значение в массиве
    *  2) FindLoop.indexInRange - метод определяет индекс минимального значения в массиве
    *  3)   */

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length);
            SwitchArray.swap(data, index, i);
        }
        return data;
    }
}
