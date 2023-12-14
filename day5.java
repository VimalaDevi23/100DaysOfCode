https://leetcode.com/problems/reverse-vowels-of-a-string

class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String reversedVowels = s.chars()
                .mapToObj(c -> (char) c)
                .filter(vowels::contains)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse()
                .toString();
      
                System.out.println("reversedVowels "+reversedVowels);

              AtomicInteger vowelIndex = new AtomicInteger(0);


       return IntStream.range(0, s.length())
                .mapToObj(i -> vowels.contains(s.charAt(i)) ? String.valueOf(reversedVowels.charAt(Math.min(vowelIndex.getAndIncrement(), reversedVowels.length() - 1))) : String.valueOf(s.charAt(i)))
                .collect(Collectors.joining());
    }
}    

Note : AtomicInteger is used to address the issue where a variable (vowelIndex) needs to be modified inside a lambda expression, which is not allowed for local variables unless they are effectively final. Since lambdas and anonymous classes require variables used within them to be effectively final, AtomicInteger is used as a mutable container for the index value.
In summary, AtomicInteger is used to provide a mutable integer with atomic operations, allowing for safe modifications within lambda expressions or anonymous inner classes where normal mutable variables would not be allowed.

Here's a step-by-step explanation:

    1.IntStream.range(0, s.length()): This creates an IntStream that represents the indices of characters in the original string s. It starts from 0 and goes up to (but not including) the length of the string.

    2.mapToObj(i -> ...): For each index i in the stream, this maps it to an object using the provided lambda expression.

    3.vowels.contains(s.charAt(i)) ? ... : ...: This is a ternary operator that checks if the character at index i in the original string s is a vowel. If it is, the expression before the ? is evaluated; otherwise, the expression after the : is evaluated.

    4.String.valueOf(reversedVowels.charAt(Math.min(vowelIndex.getAndIncrement(), reversedVowels.length() - 1))): If the character at index i is a vowel, this expression retrieves the corresponding character from the reversed vowels string. Math.min(vowelIndex.getAndIncrement(), reversedVowels.length() - 1) ensures that the index used for accessing the reversed vowels does not exceed its length. getAndIncrement() atomically retrieves the current value of vowelIndex and increments it.

    5.String.valueOf(s.charAt(i)): If the character at index i is not a vowel, this expression simply converts the character at index i from the original string to a string.

    6.collect(Collectors.joining()): Finally, all the mapped objects (characters) are collected into a single string using Collectors.joining(). This produces the final result where vowels have been replaced with their reversed counterparts.

In summary, the replaceVowels method uses Java 8 streams to iterate over the indices of characters in the original string, conditionally replaces vowels with their reversed counterparts, and then collects the result into a single string.
