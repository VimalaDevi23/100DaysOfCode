https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75



class Solution {
    public String reverseWords(String s) {

        String[] splitwords = s.split("\\s+");

        String reversewords = Arrays.stream(splitwords)
        .reduce((first,second) -> second + " " +first)
        .orElse("")
        .trim();

        return reversewords;
        
    }
}


Explanation of reduce method:
The lambda expression (first, second) -> second + " " + first reverses the order of the words by concatenating the second word, a space, and the first word. Let's break it down:
    first: Represents the accumulated result (initially an empty string).
    second: Represents the next element in the stream (the next word in the array).
The lambda expression effectively reverses the order of concatenation for each pair of words in the stream. The result is a string that represents the input words in reverse order, with each word separated by a single space.
So, the reduce operation here is a concise way to achieve the reversal of words in the stream.  
  
