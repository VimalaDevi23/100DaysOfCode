https://leetcode.com/problems/find-the-difference-of-two-arrays/description/

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         List<Integer> distinctInNums1 = Arrays.stream(nums1)
                .distinct()
                .filter(num -> !contains(nums2, num))
                .boxed()
                .collect(Collectors.toList());

        List<Integer> distinctInNums2 = Arrays.stream(nums2)
                .distinct()
                .filter(num -> !contains(nums1, num))
                .boxed()
                .collect(Collectors.toList());

        return Arrays.asList(distinctInNums1, distinctInNums2);
    }
    private static boolean contains(int[] array, int value) {
        return Arrays.stream(array).anyMatch(num -> num == value);
    }
}
