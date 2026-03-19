package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reverse_each_word {
    public static void main(String[] args) {

        String s = "Java Stream API is powerful";

        String reverse = Stream.of(s.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(reverse);

    }

}
