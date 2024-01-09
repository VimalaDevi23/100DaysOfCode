https://leetcode.com/problems/counting-words-with-a-given-prefix/


package LeetCode75;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Day30 {
    public static void main(String[] args) {
        Day30 day30 = new Day30();
        String[] words = {"pay","attention","practice","attend"};
        String pref ="at";
        int result = day30.prefixCount(words,pref);
        System.out.println(result);

    }

    private int prefixCount(String[] words, String pref) {

        return (int) Arrays.stream(words)
                .filter(word->word.startsWith(pref))
                .count();
    }
}
