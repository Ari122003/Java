package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Find_Duplicates_only {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(6, 1, 2, 3, 2, 4, 5, 1, 6);

        List<Integer> duplicates = nums.stream().collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey()).toList();

        System.out.println(duplicates);
    }

}
