https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int[] productExceptSelf(int[] nums) {

          int[] productExceptSelfValue = new int[nums.length];

        for(int j=0;j<nums.length;j++) {
             int multiply=1;
                for (int i = 0; i < nums.length; i++) {
                     if (nums[j]!=nums[i]){
                         multiply = nums[i] * multiply;
                        }
                 }

             productExceptSelfValue[j]=multiply;
            }

        return productExceptSelfValue;
    }
        
}
