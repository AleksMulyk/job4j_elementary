package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = (p / (2 + 2 * k));
        double l = 2 * h;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}