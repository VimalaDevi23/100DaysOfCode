https://leetcode.com/problems/single-number/description/


class Solution {
    public int singleNumber(int[] nums) {
        return Arrays.stream(nums).reduce(0, (a, b) -> a ^ b); 
    }
}
