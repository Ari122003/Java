package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Count_Starting {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("Apple", "Banana", "avocado", "Basil", "Appricot", "Cherry");

        int aCount = (int) arr.stream().filter(str -> str.startsWith("a") || str.startsWith("A")).count();

        Map<String, Long> freqMap = arr.stream().collect(Collectors.groupingBy(
                str -> str.substring(0, 1),
                Collectors.counting()));

        System.out.println(freqMap);

    }

}
