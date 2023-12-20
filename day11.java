https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for(int i : nums){
            if(i<=small){
                small=i;
            } else if(i<=big){
                    big=i;
                }else{
                    return true;
                }
            }
            return false;
        }

    }
