https://leetcode.com/problems/palindrome-number/

package LeetCode75;

public class Day34 {
    public static void main(String[] args) {
        Day34 day34 = new Day34();
        int x = -121;
        boolean result = day34.isPalindrome(x);
        System.out.println(result);
    }

    private boolean isPalindrome(int x) {
        String orgNumber = String.valueOf(x);
String revNumber = new StringBuilder(String.valueOf(x)).reverse().toString();

        return  orgNumber.equalsIgnoreCase(revNumber);
    }
}
