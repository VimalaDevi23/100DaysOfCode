https://leetcode.com/problems/string-matching-in-an-array/description/


class Solution {
    public List<String> stringMatching(String[] words) {
         List<String> result = new ArrayList<>();
        return Arrays.stream(words).filter(word -> Arrays.stream(words).anyMatch(otherWord-> !word.equals(otherWord)&& otherWord.contains(word)))
                .collect(Collectors.toList());
    }
}
