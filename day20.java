https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         boolean result = false;
        String s1 = Arrays.stream(word1).collect(Collectors.joining());
        String s2 = Arrays.stream(word2).collect(Collectors.joining());

        if(s1.equals(s2)){
            result =  true;
        }

        return result;
    }
}
