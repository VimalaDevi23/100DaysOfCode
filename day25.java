https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();

        return IntStream.range(0, nums.length)
                .filter(i -> {
                    int complement = target - nums[i];
                    if (numMap.containsKey(complement)) {
                        return true;
                    }
                    numMap.put(nums[i], i);
                    return false;
                })
                .mapToObj(i -> new int[]{numMap.get(target - nums[i]), i})
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No two sum solution"));
    }
        
 
}
