https://leetcode.com/problems/string-compression/submissions/1125242404/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int compress(char[] chars) {
        
    int writeIndex = 0; // Pointer to write compressed characters
        int readIndex = 0; // Pointer to read consecutive repeating characters

        while (readIndex < chars.length) {
            char currentChar = chars[readIndex];
            int count = 0;

            // Count consecutive repeating characters
            while (readIndex < chars.length && chars[readIndex] == currentChar) {
                readIndex++;
                count++;
            }

            // Write the character to the compressed array
            chars[writeIndex++] = currentChar;

            // Write the count if it's greater than 1 (and less than 10)
            if (count > 1 && count < 10) {
                chars[writeIndex++] = (char) (count + '0');
            } else if (count >= 10) {
                // If the count is 10 or more, split it into individual digits
                char[] countDigits = String.valueOf(count).toCharArray();
                for (char digit : countDigits) {
                    chars[writeIndex++] = digit;
                }
            }
        }

        return writeIndex; // Return the length of the compressed array
    }
}
