https://leetcode.com/problems/reverse-words-in-a-string-iii/

package LeetCode75;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day31 {
    public static void main(String[] args) {
        Day31 day31 = new Day31();
        String s = "Let's take LeetCode contest";
        String result = day31.reverseWords(s);
        System.out.println(result.toString());

    }
    public String reverseWords(String s){

        return Arrays.stream(s.split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
