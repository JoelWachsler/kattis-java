package se.joel.kattis.passwordhacking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PasswordHacking {

    float calculate(List<Float> passwordProbabilities) {
        List<Float> sortedPasswordProbabilities = passwordProbabilities.stream()
            .sorted(Collections.reverseOrder())
            .collect(Collectors.toList());

        double totalProbability = 0.0f;
        for (int i = 0; i < sortedPasswordProbabilities.size(); i++) {
            totalProbability += sortedPasswordProbabilities.get(i) * (i + 1);
        }
        return Math.round(totalProbability * 10_000) / 10_000f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        List<Float> probabilities = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            probabilities.add(Float.parseFloat(scanner.nextLine().split(" ")[1]));
        }

        System.out.println(new PasswordHacking().calculate(probabilities));
    }
}
