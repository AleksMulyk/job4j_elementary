package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1];
    }
}



    /*public static void main(String[] args) {
        int[] left = {1, 2, 3};
        int[] right = {5, 4, 4};
        boolean rst = check(left, right);
        System.out.println(rst);
    }*/
