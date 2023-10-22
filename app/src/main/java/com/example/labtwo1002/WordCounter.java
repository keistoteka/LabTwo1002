package com.example.labtwo1002;

public class WordCounter {
    public static int getCharsCount(String phrase) {
        return phrase.length();
    }

    public static int getWordsCount(String phrase) {
        String[] words = phrase.split("\\s");
        return words.length;
    }
}
