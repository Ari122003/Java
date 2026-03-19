package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Check_anagrams {

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        String sortedS1 = Stream.of(s1.split("")).sorted().collect(Collectors.joining());
        String sortedS2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());

        if (sortedS1.equals(sortedS2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }

}
