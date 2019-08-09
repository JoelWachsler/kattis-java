package se.joel.kattis.dicecup;

import java.util.*;
import java.util.stream.Collectors;

public class DiceCup {

    List<Integer> calculate(String input) {
        // parse input
        String[] s = input.split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        // A map containing the sum and the number of times the sum has occurred
        Map<Integer, Integer> hits = new HashMap<>();
        // All available number of the first dice
        for (int i = 1; i <= n; i++) {
            // All available number of the second dice
            for (int j = 1; j <= m; j++) {
                int sum = i + j;
                hits.put(sum, hits.getOrDefault(sum, 0) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = hits.entrySet().stream()
            .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
            .collect(Collectors.toList());

        Integer greatestValue = sortedEntries.get(0).getValue();
        return sortedEntries.stream()
            .filter(entry -> entry.getValue().equals(greatestValue))
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new DiceCup().calculate(new Scanner(System.in).nextLine())
            .forEach(System.out::println);
    }
}
