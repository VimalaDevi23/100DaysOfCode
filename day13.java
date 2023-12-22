https://leetcode.com/problems/move-zeroes/submissions/1125701098/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeroIndexLength=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                nums[nonzeroIndexLength++]=nums[i];
            }
        }
        
        for(int i=nonzeroIndexLength;i< nums.length;i++){
            nums[i]=0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
