package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class first_non_repeating {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(0, 4, 5, 1, 2, 0, 4, 5, 2);

        int fistNonRepeating = nums.stream().collect(Collectors.groupingBy(
                Function.identity(),
                LinkedHashMap::new,
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst()
                .orElse(null).getKey();

        System.out.println(fistNonRepeating);

    }
}
