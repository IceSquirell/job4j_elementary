package ru.job4j.array;
public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        int wordIndex = word.length - postfix.length;
        for (char c : postfix) {
            if (c == word[wordIndex]) {
                wordIndex++;
            } else {
                return false;
            }
        }
        return true;
    }
}