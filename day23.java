https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

class Solution {
    public int countNegatives(int[][] grid) {
        int negativeCount = (int) Arrays.stream(grid)
                .flatMapToInt(Arrays::stream)
                .filter(cell->cell<0)
                .count();
        return negativeCount;
    }
}
