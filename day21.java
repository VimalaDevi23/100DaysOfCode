https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        return    Arrays.stream(nums)
                .map(num ->(int)Arrays.stream(nums).filter(n -> n<num).count())
                .toArray();
        
    }
}
