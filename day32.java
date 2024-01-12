https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

package LeetCode75;

import java.util.Arrays;

public class Day32 {
    public static void main(String[] args) {
        Day32 day32 = new Day32();
        String[] patterns = {"a","abc","bc","d"};
        String word ="aaaaabbbbb";
        int result = day32.numOfStrings(patterns,word);
        System.out.println(result);
    }

    private int numOfStrings(String[] patterns, String word) {
        return  (int) Arrays.stream(patterns)
                .filter(word::contains)
                .count();

    }
}
