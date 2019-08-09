package se.joel.kattis.bela;

import java.util.*;
import java.util.stream.Collectors;

public class Bela {

    private static final Map<Character, Integer> dominantTable = Map.of(
        'A', 11,
        'K', 4,
        'Q', 3,
        'J', 20,
        'T', 10,
        '9', 14,
        '8', 0,
        '7', 0
    );

    private static final Map<Character, Integer> nonDominantTable = Map.of(
        'A', 11,
        'K', 4,
        'Q', 3,
        'J', 2,
        'T', 10,
        '9', 0,
        '8', 0,
        '7', 0
    );

    int calculate(List<String> input) {
        // Parse input
        char dominant = input.get(0).split(" ")[1].charAt(0);

        return input.stream()
            .skip(1)
            .map(entry -> {
                if (entry.charAt(1) == dominant) {
                    return dominantTable.get(entry.charAt(0));
                } else {
                    return nonDominantTable.get(entry.charAt(0));
                }
            })
            .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        inputList.add(firstLine);
        for (int i = 0; i < Integer.parseInt(firstLine.split(" ")[0]) * 4; i++) {
            inputList.add(scanner.nextLine());
        }

        System.out.println(new Bela().calculate(inputList));
    }
}
