package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int third) {
        return third > max(left, right) ? third : max(left, right);
    }

    public static double max(double left, double right) {
        return left > right ? left : right;
    }

    public static double max(double left, int right) {
        return left > right ? left : right;
    }
}