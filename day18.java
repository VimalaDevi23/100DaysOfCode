https://leetcode.com/problems/unique-number-of-occurrences/description/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer,Long> countvalues = new HashMap<>();
        countvalues = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));



        return countvalues.values().stream().distinct().count()==countvalues.size();
        
    }
}
