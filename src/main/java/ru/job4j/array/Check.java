package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean datum : data) {
            if (datum != data[0]) {
                return false;
            }
        }
        return true;
    }
}