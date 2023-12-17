https://leetcode.com/problems/sorting-the-sentence/description/

class Solution {
    public String sortSentence(String s) {

        String[] wordsWithIndex = s.split("\\s+");
        String[] sortedWords = Arrays.stream(wordsWithIndex)
                .sorted(Comparator.comparingInt(wordWithIndex -> Integer.parseInt(wordWithIndex.replaceAll("[^\\d]", ""))))
                .toArray(String[]::new);

        return Arrays.stream(sortedWords)
                .map(wordWithIndex -> wordWithIndex.replaceAll("\\d", ""))
                .collect(Collectors.joining(" "));
    }
}
