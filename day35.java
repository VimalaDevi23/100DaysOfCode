https://leetcode.com/problems/count-the-number-of-consistent-strings/

package LeetCode75;

import java.util.Arrays;

public class Day35 {
    public static void main(String[] args) {
        Day35 day35 = new Day35();
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int result = day35.countConsistentStrings(allowed,words);
        System.out.println(result);
    }

    private int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words)
                .filter(i->i.chars().allMatch(c->allowed.indexOf(c)!=-1))
                .count();
    }
}
