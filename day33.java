https://leetcode.com/problems/counting-words-with-a-given-prefix/

package LeetCode75;

import java.util.Arrays;

public class CountingWordsPrefix {
    public static void main(String[] args) {
        CountingWordsPrefix cwp = new CountingWordsPrefix();
        String[] words = {"pay","attention","practice","attend"};
        String pref ="at";
       int result = cwp.prefixCount(words,pref);
        System.out.println(result);

    }

    private int prefixCount(String[] words, String pref) {
        return (int) Arrays.stream(words)
                .filter(i->i.startsWith(pref))
                .count();
    }
}
