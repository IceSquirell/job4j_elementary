package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2.0F;
        float expectedUsd = 2.3333333F;
        float outEuro = Converter.rubleToEuro(in);
        float outUsd = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("140 rubles are 2.3333333 Test result : " + passedUsd);
    }
}
