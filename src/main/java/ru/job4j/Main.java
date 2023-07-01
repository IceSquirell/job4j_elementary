package ru.job4j;

import ru.job4j.calculator.Calculator;
import ru.job4j.calculator.MathFunc;
import ru.job4j.converter.Converter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int result3 = MathFunc.func1(100);
        System.out.println(result3);
        Calculator.plus(1, 2);
        Calculator.plus(10, 11);
        float euro = Converter.rubleToEuro(140);
        float usd = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 dollars are " + usd + " usd.");
    }
}