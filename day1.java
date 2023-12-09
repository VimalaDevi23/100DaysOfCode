
https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public String mergeAlternately(String word1, String word2) {

    int maxLength = Math.max(word1.trim().length(),word2.trim().length());
    
    StringBuilder mergeString = new StringBuilder();
    
    for(int i=0;i<maxLength;i++){
      if(i<word1.length()){
        mergeString.append(word1.charAt(i));
      }
      if(i<word2.length()){
        mergeString.append(word2.charAt(i));
      }
        
    }
    return (mergeString.toString());
   
        
    }
}
