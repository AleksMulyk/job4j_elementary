package ru.job4j.condition;

public class DivideBySix {
    public  static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Original number is decoupled by 6.";
        } else if (number % 3 == 0) {
            rsl = "Original number is decoupled by 3, but is not even.";
        } else if (number % 2 == 0) {
            rsl = "Original number is not decoupled by 3, but is even.";
        } else {
            rsl = "Original number is not decoupled by 3, but is not even.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(DivideBySix.checkNumber(77));
    }
}
