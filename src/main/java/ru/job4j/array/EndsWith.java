package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        return postfix[postfix.length - 1] == word[word.length - 1];
    }
}