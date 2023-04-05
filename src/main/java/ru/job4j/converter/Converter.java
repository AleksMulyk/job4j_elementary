package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
            float ineuro = 140;
            float expectedeuro = 2;
            float euro = Converter.rubleToEuro(ineuro);
            boolean passedeuro = expectedeuro == euro;
            float indollar = 180;
            float expecteddollar = 3;
            float dollar = Converter.rubleToDollar(indollar);
            boolean passeddollar = expecteddollar == dollar;
            System.out.println(ineuro + " rubles are " + expectedeuro + " euro"  + ". Test result : " + passedeuro);
            System.out.println(indollar + " rubles are " + expecteddollar + " dollar"  + ". Test result : " + passeddollar);
        }
}