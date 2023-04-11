package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static void main(String[] args) {
        int rsl = Max.max(200, 6, 250);
        System.out.println(rsl);
    }
}
