package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (true) {
            if (percent >= 1.0) {
                percent /= 100;
            }
            amount = amount + (amount * percent);
            amount = amount - salary;
            year += 1;
            if (amount <= 0) {
                return year;
            }
        }
    }
}