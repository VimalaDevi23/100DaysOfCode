https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> listBoolValues = Arrays.stream(candies).
        mapToObj(value -> value+extraCandies>=max).
        collect(Collectors.toList());

       return  listBoolValues;
    }  
}
