package ru.job4j;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int result3 = func1(100);
        System.out.println(result3);
    }

    public static int func1(int x) {
        int y;
        y = x * x;
        return y;
    }
}