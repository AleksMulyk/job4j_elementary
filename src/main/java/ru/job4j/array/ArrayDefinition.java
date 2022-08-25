package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Aleks Mulyk";
        names[1] = "Ivan Ivanov";
        names[2] = "Victor Kot";
        names[3] = "Semen Vorotov";
        System.out.println("Array 'ages' size is " + ages.length);
        System.out.println("Array 'surnames' size is " + surnames.length);
        System.out.println("Array 'prices' size is " + prices.length);
        System.out.println();
        System.out.println("Name_1 is " + names[0]);
        System.out.println("Name_2 is " + names[1]);
        System.out.println("Name_3 is " + names[2]);
        System.out.println("Name_4 is " + names[3]);

    }
}
