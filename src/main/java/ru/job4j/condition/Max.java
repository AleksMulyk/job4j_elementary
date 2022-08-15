package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        /* boolean condition = left >= right;
        int result = condition ? left : right;
        return result; */
        return left >= right ? left : right;
    }

    public static void main(String[] args) {
        int rsl = Max.max(200, 6);
        System.out.println(rsl);
    }
}
