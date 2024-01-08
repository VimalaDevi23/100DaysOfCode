https://leetcode.com/problems/find-words-containing-character/


package LeetCode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day29 {

    public static void main(String[] args) {
        Day29 day29 = new Day29();
        String[] words ={"leet","code"};
        char x= 'e';
        List<Integer> result = day29.findWordsContaining(words,x);
        System.out.println(result);

    }

    private List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>  result = new ArrayList<>();


        return IntStream.range(0,words.length)
                .filter(i->words[i].indexOf(x)!=-1)
                .boxed()
                .collect(Collectors.toList());
    }
}
