package Stream;

import java.util.Comparator;

import java.util.stream.Stream;

public class Longest_word {
    public static void main(String[] args) {
        String s = "Java Stream API is powerful";

        String longest = Stream.of(s.split("\\s+")).max(Comparator.comparingInt(String::length)).orElse(null);

        System.out.println("Longest word: " + longest);

    }

}
