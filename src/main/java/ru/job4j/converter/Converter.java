package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rslt = value / 60;
        return rslt;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuroConverter = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuroConverter);
        float inDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollarConverter = expectedDollar == outDollar;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedDollarConverter);
    }
}