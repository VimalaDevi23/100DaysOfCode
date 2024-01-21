count number of duplicate words in a string java

  package LeetCode75;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Day36 {
    public static void main(String[] args) {
        Day36 day36 = new Day36();
        String[] values = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};
        Map<String,Long>  result = day36.findDuplicateStringsInArray(values);
        System.out.println(result);
    }

    private Map<String, Long> findDuplicateStringsInArray(String[] values) {
        Map<String,Long> duplicateStringCount = Arrays.stream(values)
                .collect(Collectors.groupingBy(s->s,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        return duplicateStringCount ;
    }
}
