package ru.job4j.calculator;

public class MathFunc {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result3 = func1(100);
        int result2 = MathFunc.func2(5);
        System.out.println(result3);
    }
}