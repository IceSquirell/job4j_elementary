package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int third) {
        return max(max(left, right), third);
    }

    public static double max(double left, double right) {
        return Math.max(left, right);
    }

    public static double max(double left, int right) {
        return Math.max(left, right);
    }
}