https://leetcode.com/problems/truncate-sentence/

class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.split("\\s+");

         return Arrays.stream(words)
                .limit(k)
                .collect(Collectors.joining(" "));
                
    }
}
