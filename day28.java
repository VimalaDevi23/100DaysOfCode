https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/


import java.util.Arrays;

public class MaxWordsCountExample {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        int maxWordsCount = findMaxWordsCount(sentences);

        System.out.println("Max number of words: " + maxWordsCount);
    }

    public static int findMaxWordsCount(String[] sentences) {
        return Arrays.stream(sentences)
                .map(sentence -> sentence.split("\\s+").length)
                .max(Integer::compare)
                .orElse(0);
    }
}
